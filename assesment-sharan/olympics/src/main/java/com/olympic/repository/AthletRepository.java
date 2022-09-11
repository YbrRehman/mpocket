package com.olympic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olympic.model.Athelet;

@Repository
public interface AthletRepository  extends JpaRepository<Athelet, Integer>{

}
