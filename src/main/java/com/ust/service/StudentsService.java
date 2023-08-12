package com.ust.service;

import java.util.List;

import com.ust.exception.StudentNotFoundException;
import com.ust.model.Students;

public interface StudentsService {

	Students saveStudentsData(Students s);
	
	List<Students> getAllstudents();
	
	Students getStudentById(int id) throws StudentNotFoundException;
	
	Students updateStudent(Students s, int id) throws StudentNotFoundException;
	
	void deleteStudent(int id);
}
