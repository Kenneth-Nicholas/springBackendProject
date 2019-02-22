package lab.controller;

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
	
	@RequestMapping(value="/submitStudentDetails", 
			        consumes = MediaType.APPLICATION_JSON_VALUE, 
			        method = RequestMethod.POST)
	
	public void submitStudentDetails(@RequestBody Student student) {
		
		this.studentRepository.save(student);
		
	}
	
	@RequestMapping(value="/findStudentByEmail",
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
	
	@ResponseBody
	public ResponseEntity<Student> findStudent(String email) {
		
		Student student = this.studentRepository.findOne(email);
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}
	
	// insert the two that we have to write ourselves in here.
	
}