package com.olympic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympic.model.Athelet;
import com.olympic.repository.AthletRepository;
@Service
public class AthletServiceImpl implements AthletService{

	@Autowired
	AthletRepository athletRepository;
	@Override
	public void add(Athelet athelet) {
		athletRepository.save(athelet);
		
	}

	@Override
	public List<Athelet> getAll() {
		
		return athletRepository.findAll();
	}

}
