package com.olympic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olympic.model.Olympic;

@Repository
public interface OlympicRepository extends JpaRepository<Olympic, Integer>{

}
