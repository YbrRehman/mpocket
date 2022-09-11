package com.olympic.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Olympic {

	@Id
	@GeneratedValue(generator = "olympic_gen" ,strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "olympic_gen",sequenceName = "olympic_seq" ,initialValue = 1945,allocationSize = 4)
	@Column(name = "hostingyear")
	private Integer hostingYear;
	private String hostedBy;
	@OneToMany
	private List<Sport>sports;
	@OneToMany
	private List<Country>countries;
	public Olympic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Olympic(String hostedBy, List<Sport> sports, List<Country> countries) {
		super();
		this.hostedBy = hostedBy;
		this.sports = sports;
		this.countries = countries;
	}
	public Integer getHostingYear() {
		return hostingYear;
	}
	public void setHostingYear(Integer hostingYear) {
		this.hostingYear = hostingYear;
	}
	public String getHostedBy() {
		return hostedBy;
	}
	public void setHostedBy(String hostedBy) {
		this.hostedBy = hostedBy;
	}
	public List<Sport> getSports() {
		return sports;
	}
	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}
	public List<Country> getCountries() {
		return countries;
	}
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
	
}
