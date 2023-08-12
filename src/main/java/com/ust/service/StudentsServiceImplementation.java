package com.ust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.exception.StudentNotFoundException;
import com.ust.model.Students;
import com.ust.repository.StudentsRepository;

@Service
public class StudentsServiceImplementation implements StudentsService {
	
	@Autowired
	private StudentsRepository studentRepo;

	@Override
	public Students saveStudentsData(Students s) {
		Students saveStudent = studentRepo.save(s);
		return saveStudent;
	}

	@Override
	public List<Students> getAllstudents() {
		return studentRepo.findAll();
	}

	@Override
	public Students getStudentById(int id) throws StudentNotFoundException {
		Optional<Students> s = studentRepo.findById(id);
		if(s.isPresent()) {
			return s.get();
		} else {
			throw new StudentNotFoundException();
		}
		
	}

	@Override
	public Students updateStudent(Students s, int id) throws StudentNotFoundException {
		Students existingStudents = studentRepo.findById(id).
		 		orElseThrow(() -> new StudentNotFoundException("Not Found"));
		
		existingStudents.setStudent_name(s.getStudent_name());
		existingStudents.setStudent_institute(s.getStudent_institute());
		existingStudents.setStudent_age(s.getStudent_age());
		existingStudents.setGender(s.getGender());
		existingStudents.setEmail(s.getEmail());
		
		studentRepo.save(existingStudents);
		return existingStudents;
		
	}

	@Override
	public void deleteStudent(int id) {
		studentRepo.findById(id);
		studentRepo.deleteById(id);
		
	}

}
