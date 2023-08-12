package com.ust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ust.exception.StudentNotFoundException;
import com.ust.model.Students;
import com.ust.service.StudentsService;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentsController {
	
	@Autowired
	private StudentsService ss;
	
	
	@PostMapping
	public ResponseEntity<Students> saveStudentsData(@RequestBody Students s) {
		
		return new ResponseEntity<Students>(ss.saveStudentsData(s),HttpStatus.CREATED);
	}

	@GetMapping
	public List<Students> getAllstudents() {
		
		return ss.getAllstudents();
	}
	
	@GetMapping("getStudentbyId/{id}")
	public ResponseEntity<Students> getStudentById(@PathVariable ("id") int student_id) throws StudentNotFoundException {
		
		return new ResponseEntity<Students>(ss.getStudentById(student_id),HttpStatus.OK);
	}
	
	@PutMapping("updateStudent/{id}")
	public ResponseEntity<Students> updateStudent(@PathVariable("id") int student_id, 
			@RequestBody Students s) throws StudentNotFoundException {
		
		return new ResponseEntity<Students>(ss.updateStudent(s, student_id),HttpStatus.OK);
	}
	
	@DeleteMapping("deleteStudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") int student_id ) {
		
		ss.deleteStudent(student_id);
		
		return new ResponseEntity<String>("Student Deleted Sucessfully",HttpStatus.OK);
	}
	
	@RequestMapping(value = "/stud", method = RequestMethod.GET)
	public Students firstStudent() {
		
		Students s = new Students();
		s.setStudent_id(1);
		s.setStudent_name("Dheeraj");
		s.setStudent_institute("TKR Institute");
		s.setStudent_age(22);
		s.setGender("male");
		s.setEmail("dheeraj@gmail.com");
		
		return s;
	}
}
