package com.ust.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hamcrest.Matchers;
//import org.junit.jupiter.api.Test;
//import org.mockito.ArgumentMatchers;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.ust.controller.StudentsController;
import com.ust.model.Students;
import com.ust.service.StudentsService;
//import com.ust.model.Students;
//import com.ust.service.StudentsService;
//
@WebMvcTest(StudentsController.class)
public class ControllerLayerTest {
//	
	@Autowired
	private MockMvc mockMvc;
//	
	@MockBean
	StudentsService studentService;
//	
	ObjectMapper mapper = new ObjectMapper();
//	

	Students s;
@BeforeEach
public void setUp() {
	s= new Students();
	s.setStudent_id(2);
	s.setStudent_name("Surya");
	s.setStudent_institute("Trombay Institute");
	s.setStudent_age(22);
	s.setGender("male");
	s.setEmail("surya@gmail.com");
//	s.set to-do
}
	@Test
	public void testPost() throws Exception {
		
		mockMvc.perform(post("/students")
				.contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(s)))
		.andExpect(status().isCreated());
	}
		

	
//	
	@Test
	public void testGet() throws Exception{
		
		mockMvc.perform(get("/students")).andExpect(status().isOk());	
		
		}
	}
//	
//	@Test
//	public void putTest() throws Exception {
//		
//		Students student = new Students();
//		student.setStudent_id(2);
//		student.setStudent_name("Surya");
//		student.setStudent_institute("Trombay Institute");
//		student.setStudent_age(22);
//		student.setGender("male");
//		student.setEmail("surya@gmail.com");
//		
//		when(studentService.updateStudent(Mockito.any(Students.class),
//		  Mockito.anyInt())).thenReturn(student); 
//		String json = new ObjectMapper().writeValueAsString(student);
//		
//		mockMvc.perform(put("/students/updateStudent/2").contentType(MediaType.
//		   APPLICATION_JSON).content(json)) .andExpect(status().isOk());
//		
//	}
//	
//	@Test
//	public void deleteTest() throws Exception {
//		
//		//Students student = new Students();
//		//Mockito.when(studentService.deleteStudent(Mockito.anyInt())).thenReturn("Student is deleted");
//		
//		MvcResult requestResult = mockMvc.perform(delete("/students/deleteStudent/2"))
//				.andExpect(status().isOk())

//		
//		String result = requestResult.getResponse().getContentAsString();
//		assertEquals(result, "Student Deleted Sucessfully");
//		
//	}
//	
//}
