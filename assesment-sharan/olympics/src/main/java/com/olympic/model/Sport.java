package com.olympic.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class Sport {

	@Id
	@GeneratedValue
	@SequenceGenerator(name = "sport_gen",sequenceName = "sport_seq",initialValue = 100,allocationSize = 1)
	
	private Integer serialNo;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "sport_country",joinColumns = @JoinColumn(name="serial_no"),inverseJoinColumns = @JoinColumn(name="country_id"))
	private List<Country>countries;
	@OneToMany
	private List<Athelet>athelets;
	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sport(String name, List<Country> countries) {
		super();
		this.name = name;
		this.countries = countries;
		
	}
	
}
