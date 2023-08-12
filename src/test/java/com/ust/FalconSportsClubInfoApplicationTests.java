package com.ust;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ust.model.Students;
import com.ust.repository.StudentsRepository;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class FalconSportsClubInfoApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Autowired
	StudentsRepository studRepo;
//
//	@Test
//	@Order(1)
//	public void testCreate() {
//		
//		Students s = new Students();
//		//s.setStudent_id(64);
////		s.setStudent_name("Surya");
////		s.setStudent_age(21);
////		s.setStudent_institute("Vignan Institute");
////		s.setGender("male");
////		s.setEmail("surya@gmail.com");
////		
////		studRepo.save(s);
//		
//		assertNotNull(studRepo.findById(59).get());		
//	}
	
	@Test
	@Order(2)
	public void testReadAll() {
	
		List<Students> listOfStudents = studRepo.findAll();
		assertThat(listOfStudents).size().isGreaterThan(10);
		
	}
	
	@Test
	@Order(3)
	public void testSingleStudent() {
		Students s = studRepo.findById(31).get();
		assertEquals("Trombay Institute", s.getStudent_institute());
	}
	
	@Test
	@Order(4)
	public void s() {
		Students s = studRepo.findById(28).get();
		s.setEmail("lahari1@gmail.com");
		studRepo.save(s);
		assertNotEquals("lahari@gmail.com", studRepo.findById(28).get().getStudent_institute());
	}
	
//	@Test
//	@Order(5)
//	public void testDelete() {
//		
//		studRepo.deleteById(62);
//		assertThat(studRepo.existsById(62)).isFalse();
//	}
	
	
	
}
