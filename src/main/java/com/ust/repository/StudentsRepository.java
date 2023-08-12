package com.ust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.model.Students;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface StudentsRepository extends JpaRepository<Students, Integer>{

}
