package com.ust.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "venue")
public class Venue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int venue_id;
	
	private String venue_name;
	
	private String venue_location;
	
	private String description;

	public Venue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venue(int venue_id, String venue_name, String venue_location, String description) {
		super();
		this.venue_id = venue_id;
		this.venue_name = venue_name;
		this.venue_location = venue_location;
		this.description = description;
	}

	public int getVenue_id() {
		return venue_id;
	}

	public void setVenue_id(int venue_id) {
		this.venue_id = venue_id;
	}

	public String getVenue_name() {
		return venue_name;
	}

	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}

	public String getVenue_location() {
		return venue_location;
	}

	public void setVenue_location(String venue_location) {
		this.venue_location = venue_location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
