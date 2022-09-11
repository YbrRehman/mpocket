package com.mpockett.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {
	private String studentName;
	@Id
	@GeneratedValue(generator = "student_gen",strategy =GenerationType.AUTO )
	@SequenceGenerator(name = "student_gen",sequenceName = "student_seq",initialValue = 10,allocationSize = 1)
	private Integer studentId;
	@Column(length=20)
	private String collegeName;
	@OneToOne(cascade = CascadeType.ALL)
	private  Address address;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Documents>documents;
	public Student() {
		super();
	}
	public Student(String studentName, String collegeName, Address address, List<Documents> documents) {
		super();
		this.studentName = studentName;
		this.collegeName = collegeName;
		this.address = address;
		this.documents = documents;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Documents> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Documents> documents) {
		this.documents = documents;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", collegeName=" + collegeName
				+ ", address=" + address + ", documents=" + documents + "]";
	}
	
	
	
}
