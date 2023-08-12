//package com.ust.test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.aspectj.lang.annotation.Before;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.ust.model.Students;
//import com.ust.repository.StudentsRepository;
//import com.ust.service.StudentsService;
//
////
//@DataJpaTest
//public class FalconSportsClubInfoTest {
//	
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Autowired
//	private StudentsService studentService;
//	
//	@MockBean
//	private StudentsRepository studRepo;
//	
//	@Test
//	public void getAllstudentsTest() {
//		when(studRepo.findAll()).thenReturn(Stream
//				.of(new Students(1,"Sree Suyra","Vignan Institute",22,"male","ss@gmail.com"),
//						new Students(2,"Sai Karthik","Powai Institute",21,"male","ssk@gmail.com"))
//				.collect(Collectors.toList()));
//		
//		assertEquals(2, studentService.getAllstudents().size());
//	}
//	
//	@Test
//	public void saveStudentsDataTest() {
//		
//		Students student = new Students(3,"Vishwa","Trombay Institute",20,"male","vishwa@gmail.com");
//		when(studRepo.save(student)).thenReturn(student);
//		
//		assertEquals(student, studentService.saveStudentsData(student));
//		
//	}
//	
//
//	
//	
//	
////	@Autowired
////	private WebApplicationContext webApplicationContext;
////	
////	@Before(value = "")
////	public void setUp() {
////		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
////	}
////	
////	@Test
////	public void testStudents() throws Exception {
////		
////		this.mockMvc.perform(get("/students/stud")).andExpect(status().isOk())
////		.andExpect(content().contentType("application/json;charset=UTF-8"))
////		.andExpect(jsonPath("$.student_id").value(1))
////		.andExpect(jsonPath("$.student_name").value("Dheeraj"))
////		.andExpect(jsonPath("$.student_institute").value("TKR Institute"))
////		.andExpect(jsonPath("$.student_age").value(22))
////		.andExpect(jsonPath("$.gender").value("male"))
////		.andExpect(jsonPath("$.email").value("dheeraj@gmail.com"));
////		
////		
////		this.mockMvc.perform(get("/students.stud")).andDo(print()).andExpect(status().isOk());
////	}
//}
