package com.ust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ust.exception.VenueNotFoundException;
import com.ust.model.Venue;
import com.ust.service.VenueService;

@RestController
@RequestMapping(value = "venue")
public class VenueController {

	@Autowired
	private VenueService vs;
	
	@PostMapping
	public ResponseEntity<Venue> saveVenueData(@RequestBody Venue v) {
		
		return new ResponseEntity<Venue> (vs.saveVenueData(v), HttpStatus.CREATED);
	}

	@GetMapping
	public List<Venue> getAllVenue() {
		
		return vs.getAllVenues();
		
	}
	
	@GetMapping("getVenuebyId/{id}")
	public ResponseEntity<Venue> getVenueById(@PathVariable ("id") int venue_id) throws VenueNotFoundException {
		
		return new ResponseEntity<Venue>(vs.getVenueById(venue_id),HttpStatus.OK);
	}
	
	@PutMapping("updateVenue/{id}")
	public ResponseEntity<Venue> updateVenue(@PathVariable("id") int venue_id, 
			@RequestBody Venue v) throws VenueNotFoundException {
		
		return new ResponseEntity<Venue>(vs.updateVenue(v, venue_id),HttpStatus.OK);
	}
	
	@DeleteMapping("deleteVenue/{id}")
	public ResponseEntity<String> deleteVenue(@PathVariable("id") int venue_id ) {
		
		vs.deleteVenue(venue_id);
		
		return new ResponseEntity<String>("Venue Deleted Sucessfully",HttpStatus.OK);
	}
	
}
