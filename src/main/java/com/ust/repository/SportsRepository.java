package com.ust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.model.Sports;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface SportsRepository extends JpaRepository<Sports, Integer>{

}
