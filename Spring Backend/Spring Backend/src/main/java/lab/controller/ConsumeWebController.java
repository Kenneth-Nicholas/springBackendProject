package lab.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import entity.EventDTO;
import entity.Events;
import entity.StLouisEvents;
import entity.Student;
import repository.EventRepository;

@RestController
@CrossOrigin
public class ConsumeWebController {
	
   @Autowired
   RestTemplate restTemplate;
   
   @Autowired
   EventRepository eventRepo;

   @Autowired
   SendMail sendMail;
   
   @RequestMapping(value="/searchEvents", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
   @ResponseBody
   public ResponseEntity<ArrayList<Events>> searchListOfEvents(@RequestParam("searchQuery") String searchQuery) {
	   
	    System.out.println("Searching for: " + searchQuery);
	   
		ArrayList<Events> listOfEvents = this.eventRepo.findByDescriptionContaining(searchQuery);
		
		System.out.println("Events found: " + listOfEvents.size());
		
		return new ResponseEntity<ArrayList<Events>>(listOfEvents, HttpStatus.OK);
		
	}
   
   @RequestMapping(value="/emailEvent", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
   @ResponseBody
   public void emailEvent(@RequestParam("eventId") int eventId, HttpSession session) {
	   
	    System.out.println("Searching for: " + eventId);
	   
	    Student user = (Student) session.getAttribute("loggedInUser");
		
		Events myEvent = this.eventRepo.findOne(eventId);
		System.out.println("Events found: " + myEvent);
		
		sendMail.sendMail(user.getEmail(), "Event Notification", myEvent.getDescription());
		
	}
   
   @RequestMapping(value = "/getEvents")
   public void getEvents() {
	   
      HttpHeaders headers = new HttpHeaders();
      headers.set("Authorization", "Bearer OWRMAGCINAVM2ZE4HHA6");
      
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      
      HttpEntity <String> entity = new HttpEntity<String>(headers);
      
      ResponseEntity<StLouisEvents> result = restTemplate.exchange("https://www.eventbriteapi.com/v3/events/search?q=St. Louis", HttpMethod.GET, entity, StLouisEvents.class);
      
      ArrayList<Events> events = new ArrayList<Events>();
      
      for (EventDTO eventDto : result.getBody().getEvents()) {
    	  
    	  events.add(this.eventDTOtoEvent(eventDto));
    	  
	  }
      
      eventRepo.save(events);
      System.out.println(result.getBody().getEvents());
      
   }
   
   public Events eventDTOtoEvent(EventDTO eventDto) {
	   
	   System.out.println(eventDto);
	   
	   Events myEvent = new Events(eventDto.getName().getText(), eventDto.getDescription().getText(), 
	   eventDto.getStart()==null?"":eventDto.getStart().getLocal().getText(), eventDto.getEnd()==null?"":eventDto.getEnd().getLocal().getText(),
	   eventDto.getSummary()==null?"":eventDto.getSummary().getText(), eventDto.getLogo()==null?"":eventDto.getLogo().getOriginal().getUrl());
	   
	   return myEvent;
	   
   }
   
}