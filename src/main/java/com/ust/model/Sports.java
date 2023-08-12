package com.ust.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sports")
public class Sports {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sports_id;
	
	private String sports_event;
	
	private String sports_names;

	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sports(int sports_id, String sports_event, String sports_names) {
		super();
		this.sports_id = sports_id;
		this.sports_event = sports_event;
		this.sports_names = sports_names;
	}

	public int getSports_id() {
		return sports_id;
	}

	public void setSports_id(int sports_id) {
		this.sports_id = sports_id;
	}

	public String getSports_event() {
		return sports_event;
	}

	public void setSports_event(String sports_event) {
		this.sports_event = sports_event;
	}

	public String getSports_names() {
		return sports_names;
	}

	public void setSports_names(String sports_names) {
		this.sports_names = sports_names;
	}
	
	
}
