package lab.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Student;
import repository.StudentRepository;

@RestController
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	// Submit a Student's details
	
	@RequestMapping(value="/submitStudentDetails", 
			        consumes = MediaType.APPLICATION_JSON_VALUE, 
			        method = RequestMethod.POST)
	
	public void submitStudentDetails(@RequestBody Student student) {
		
		this.studentRepository.save(student);
		
	}
	
	// Find a Student by e-mail address
	
	@RequestMapping(value="/findStudentByEmail",
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
	
	@ResponseBody
	public ResponseEntity<Student>findStudent(String email) {
		
		Student student = this.studentRepository.findOne(email);
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}
	
	// Logging a Student into their account
	
	@RequestMapping(value="/loginStudent",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	
	@ResponseBody
	public ResponseEntity<Student>loginStudent(@RequestBody Student student) {
		
		Student studentMatch = this.studentRepository.findOne(student.getEmail());
		
		if(studentMatch.getPassword().equals(student.getPassword())) {
			
			return new ResponseEntity<>(studentMatch, HttpStatus.OK);
			
		} else {
			
			return null;
			
		}
		
	}
	
	// Finding a list of Students
	
	@RequestMapping(value="/findListOfStudents",
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
	
	@ResponseBody
	public ResponseEntity<ArrayList<Student>> findListOfStudents() {
		
		ArrayList<Student> listOfStudents = (ArrayList<Student>) this.studentRepository.findAll();
		
		return new ResponseEntity<ArrayList<Student>>( listOfStudents, HttpStatus.OK);
		
	}

}