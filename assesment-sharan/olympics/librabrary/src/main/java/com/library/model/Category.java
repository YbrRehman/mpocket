package com.library.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Category {
	@Id
	@GeneratedValue(generator = "cat_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "cat_gen",sequenceName = "cat_seq",initialValue = 100,allocationSize = 1)
	private Integer id;
	private String name;
	@ManyToMany(mappedBy = "categories")
	private Set<Book>books;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String name) {
		super();
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	
}
