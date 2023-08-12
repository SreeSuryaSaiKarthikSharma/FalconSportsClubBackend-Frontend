package com.ust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.ust.exception.SportsNotFoundException;
import com.ust.model.Sports;
import com.ust.repository.SportsRepository;

@Service
public class SportsServiceImplementation implements SportsService {
	
	@Autowired
	private SportsRepository sportRepo;

	@Override
	public Sports saveSportsData(Sports sp) {
		Sports saveSport = sportRepo.save(sp);
		return saveSport;
	}

	@Override
	public List<Sports> getAllSports() {
		return sportRepo.findAll(); 
	}

	@Override
	public Sports getSportsById(int id) throws SportsNotFoundException {
		Optional<Sports> sp = sportRepo.findById(id);
		if(sp.isPresent()) {
			return sp.get();
		} else {
			throw new SportsNotFoundException();
		}
	}

	@Override
	public Sports updateSport(Sports sp, int id) throws SportsNotFoundException {
		Sports existingSports = sportRepo.findById(id).
				orElseThrow(() -> new SportsNotFoundException("Not Found"));
		
		existingSports.setSports_names(sp.getSports_names());
		existingSports.setSports_event(sp.getSports_event());
		
		sportRepo.save(existingSports);
		return existingSports;
	}

	@Override
	public void deleteSport(int id) {
		sportRepo.findById(id);
		sportRepo.deleteById(id);
		
	}

}
