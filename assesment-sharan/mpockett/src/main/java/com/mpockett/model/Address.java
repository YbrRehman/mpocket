package com.mpockett.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {

	@Id
	@GeneratedValue(generator = "address_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "address_gen",sequenceName = "address_seq",initialValue = 10,allocationSize = 1)
	private Integer addrerssId;
	
	@Column(length=20)
	private String streetName;
	@Column(length =20)
	private String city;
	@Column(length = 20)
	private String state;
	@Column(length=8)
	private int zipcode;
	public Address() {
		super();
	}
	public Address(String streetName, String city, String state, int zipcode) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public Integer getAddrerssId() {
		return addrerssId;
	}
	public void setAddrerssId(Integer addrerssId) {
		this.addrerssId = addrerssId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [addrerssId=" + addrerssId + ", streetName=" + streetName + ", city=" + city + ", state="
				+ state + ", zipcode=" + zipcode + "]";
	}
	
	
}
