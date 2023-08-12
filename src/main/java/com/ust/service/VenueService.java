package com.ust.service;

import java.util.List;

import com.ust.exception.VenueNotFoundException;
import com.ust.model.Venue;

public interface VenueService {
	
	Venue saveVenueData(Venue v);
	
	List<Venue> getAllVenues();
	
	Venue getVenueById(int id) throws VenueNotFoundException;
	
	Venue updateVenue(Venue v, int id) throws VenueNotFoundException;
	
	void deleteVenue(int id);
	
}
