package com.olympic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympic.model.Olympic;
import com.olympic.repository.OlympicRepository;
@Service
public class OlympicServiceImpl implements OlympicService {

	@Autowired
	OlympicRepository olympicRepository;
	@Override
	public void add(Olympic olympic) {
		// TODO Auto-generated method stub
		olympicRepository.save(olympic);
		
	}

	@Override
	public List<Olympic> getAll() {
		// TODO Auto-generated method stub
		return olympicRepository.findAll();
	}

}
