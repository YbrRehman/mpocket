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
public class Country {
    @Id
    @GeneratedValue
    @SequenceGenerator(name = "country_gen",sequenceName = "country_seq",initialValue = 1,allocationSize = 1)
	private Integer countryId;
    private String name;
    @ManyToMany(mappedBy = "countries")
    private List<Sport> sports;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Athelet>athlets;
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String name) {
		super();
		this.name = name;
		
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Sport> getSports() {
		return sports;
	}
	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}
	public List<Athelet> getAthlets() {
		return athlets;
	}
	public void setAthlets(List<Athelet> athlets) {
		this.athlets = athlets;
	}
	
    
    
	
}
