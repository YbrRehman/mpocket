package com.olympic.service;

import java.util.List;

import com.olympic.model.Olympic;

public interface OlympicService {

	public void add(Olympic olympic);
	public List<Olympic>getAll();
}
