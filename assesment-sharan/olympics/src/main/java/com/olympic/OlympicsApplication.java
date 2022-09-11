package com.olympic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.olympic.model.Athelet;
import com.olympic.model.Country;
import com.olympic.model.Olympic;
import com.olympic.model.Sport;
import com.olympic.service.AthletService;
import com.olympic.service.OlympicService;

@SpringBootApplication
public class OlympicsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OlympicsApplication.class, args);
	}
    @Autowired
    AthletService athletService;
    @Autowired
    OlympicService olympicService;
	@Override
	public void run(String... args) throws Exception {
		
		Country country=new Country("India");
		List<Country>set=new ArrayList<>();
		set.add(country);
		Sport sport=new Sport("hockey", set);
		Athelet athelet=new Athelet("sadik", country, sport);
		Olympic olympic=new Olympic("Brazil",Arrays.asList(sport), set);
		athletService.add(athelet);
		olympicService.add(olympic);
		
	}

}
