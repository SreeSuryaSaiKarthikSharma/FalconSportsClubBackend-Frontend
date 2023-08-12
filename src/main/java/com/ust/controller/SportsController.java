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

import com.ust.exception.SportsNotFoundException;
import com.ust.model.Sports;
import com.ust.service.SportsService;

@RestController
@RequestMapping(value = "sports")
public class SportsController {
	
	@Autowired
	private SportsService sps;
	
	
	@PostMapping
	public ResponseEntity<Sports> saveSportsData(@RequestBody Sports sp) {
		
		return new ResponseEntity<Sports>(sps.saveSportsData(sp),HttpStatus.CREATED);
	}

	@GetMapping
	public List<Sports> getAllsports() {
		
		return sps.getAllSports();
	}
	
	@GetMapping("getSportsbyId/{id}")
	public ResponseEntity<Sports> getSportsById(@PathVariable ("id") int sports_id) throws SportsNotFoundException {
		
		return new ResponseEntity<Sports>(sps.getSportsById(sports_id),HttpStatus.OK);
	}
	
	@PutMapping("updateSports/{id}")
	public ResponseEntity<Sports> updateSport(@PathVariable("id") int sports_id, 
			@RequestBody Sports sp) throws SportsNotFoundException {
		
		return new ResponseEntity<Sports>(sps.updateSport(sp, sports_id),HttpStatus.OK);
	}
	
	@DeleteMapping("deleteSport/{id}")
	public ResponseEntity<String> deleteSport(@PathVariable("id") int sports_id ) {
		
		sps.deleteSport(sports_id);
		
		return new ResponseEntity<String>("Sport Deleted Sucessfully",HttpStatus.OK);
	}
	

}
