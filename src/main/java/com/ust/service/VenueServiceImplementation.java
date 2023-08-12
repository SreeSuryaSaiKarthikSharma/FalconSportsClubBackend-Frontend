package com.ust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ust.exception.VenueNotFoundException;
import com.ust.model.Venue;
import com.ust.repository.VenueRepository;

@Service
public class VenueServiceImplementation implements VenueService {
	
	@Autowired
	private VenueRepository venueRepo;

	@Override
	public Venue saveVenueData(Venue v) {
		
		Venue saveVenue = venueRepo.save(v);
		return saveVenue;
	}

	@Override
	public List<Venue> getAllVenues() {
		return venueRepo.findAll();
	}

	@Override
	public Venue getVenueById(int id) throws VenueNotFoundException {
		
		Optional<Venue> v = venueRepo.findById(id);
		if(v.isPresent()) {
			return v.get();
		} else {
			throw new VenueNotFoundException();
		}
	}

	@Override
	public Venue updateVenue(Venue v, int id) throws VenueNotFoundException {
		
		Venue existingVenue = venueRepo.findById(id).
				orElseThrow( () -> new VenueNotFoundException("Not Found"));
		
		existingVenue.setVenue_location(v.getVenue_location());
		existingVenue.setVenue_name(v.getVenue_name());
		existingVenue.setDescription(v.getDescription());
		
		venueRepo.save(existingVenue);
		return existingVenue;
	}

	@Override
	public void deleteVenue(int id) {
		
		venueRepo.findById(id);
		venueRepo.deleteById(id);
		
	}

}
