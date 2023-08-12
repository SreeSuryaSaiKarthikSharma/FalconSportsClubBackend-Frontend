package com.ust.service;

import java.util.List;

import com.ust.exception.SportsNotFoundException;
import com.ust.model.Sports;

public interface SportsService {

	Sports saveSportsData(Sports sp);
	
	List<Sports> getAllSports();
	
	Sports getSportsById(int id) throws SportsNotFoundException;
	
	Sports updateSport(Sports sp, int id) throws SportsNotFoundException;
	
	void deleteSport(int id);
}
