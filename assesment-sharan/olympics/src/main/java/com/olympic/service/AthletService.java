package com.olympic.service;

import java.util.List;

import com.olympic.model.Athelet;

public interface AthletService {
	public void add(Athelet athelet);
	public List<Athelet> getAll();

}
