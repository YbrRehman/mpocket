package com.olympic.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Athelet {
	@javax.persistence.Id
	@GeneratedValue(generator = "athlet_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "athlet_gen",sequenceName = "athlet_seq")
	private Integer Id;
	private String name;
	@ManyToOne
	private Country country;
	@ManyToOne
    private Sport sport;
	public Athelet(String name, Country country, Sport sport) {
		super();
		this.name = name;
		this.country = country;
		this.sport = sport;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
	
	
}
