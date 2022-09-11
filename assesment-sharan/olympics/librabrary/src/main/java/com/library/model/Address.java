package com.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {
	@Id
	@GeneratedValue(generator = "add_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "add_gen",sequenceName = "add_seq",initialValue = 100,allocationSize = 1)
	private Integer id;
	private String city;
	private String occupation;
	private long zipcode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String occupation, long zipcode) {
		super();
		this.city = city;
		this.occupation = occupation;
		this.zipcode = zipcode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", occupation=" + occupation + ", zipcode=" + zipcode + "]";
	}
	

}
