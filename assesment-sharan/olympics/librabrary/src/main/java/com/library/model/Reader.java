package com.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;



@Entity
public class Reader {
	@Id
	@GeneratedValue(generator = "read_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "read_gen",sequenceName = "read_seq",initialValue = 100,allocationSize = 1)
	@Column(name = "readerid")
	private Integer readerId;
	private String name;
	@OneToOne
	private Address address;
	@OneToOne
	private Book book;
	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reader(String name, Address address, Book book) {
		super();
		this.name = name;
		this.address = address;
		this.book = book;
	}
	public Integer getReaderId() {
		return readerId;
	}
	public void setReaderId(Integer readerId) {
		this.readerId = readerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Reader [readerId=" + readerId + ", name=" + name + ", address=" + address + ", book=" + book + "]";
	}
	

}
