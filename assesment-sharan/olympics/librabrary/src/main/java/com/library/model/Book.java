package com.library.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Book {
	@Id
	@GeneratedValue(generator = "book_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "book_gen",sequenceName = "book_seq",initialValue = 100,allocationSize = 1)
	@Column(name = "bookid")
	private Integer bookId;
	private String title;
	private double price;
	private String author;
	@OneToOne
	private Reader reader;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "book_category",joinColumns = @JoinColumn(name="bookid"),inverseJoinColumns = @JoinColumn(name="catgoryid"))
	private Set<Category> categories;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, double price, String author, Set<Category> categories) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
		this.categories = categories;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", author=" + author + ", reader="
				+ reader + ", categories=" + categories + "]";
	}
	

}
