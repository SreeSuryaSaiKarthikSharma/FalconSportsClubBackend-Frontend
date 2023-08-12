package com.ust.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	
	private String student_name;
	
	private String student_institute;
	
	private int student_age;

	private String gender;
	
	private String email;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_institute() {
		return student_institute;
	}

	public void setStudent_institute(String student_institute) {
		this.student_institute = student_institute;
	}

	public int getStudent_age() {
		return student_age;
	}

	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Students(int student_id, String student_name, String student_institute, int student_age, String gender,
			String email) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_institute = student_institute;
		this.student_age = student_age;
		this.gender = gender;
		this.email = email;
	}

	public static Students builder() {
		// TODO Auto-generated method stub
		return null;
	}



	
}
