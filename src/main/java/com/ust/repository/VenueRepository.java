package com.ust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.model.Venue;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface VenueRepository extends JpaRepository<Venue, Integer> {

}
