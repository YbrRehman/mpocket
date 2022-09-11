package com.mpockett.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Loan {
	
	private String loanName;
	
	@Id
	@GeneratedValue(generator="loan_name",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "loan_name",sequenceName = "loan_seq",initialValue = 1000,allocationSize = 1)
	private int loanId;
	
	
	private double loanAmount;
	private double intrest;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Student>student;
	public Loan() {
		super();
	}
	public Loan(String loanName,  double loanAmount, double intrest, List<Student> student) {
		super();
		this.loanName = loanName;
		this.loanAmount = loanAmount;
		this.intrest = intrest;
		this.student = student;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getIntrest() {
		return intrest;
	}
	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Mpockett [loanName=" + loanName + ", loanId=" + loanId + ", loanAmount="
				+ loanAmount + ", intrest=" + intrest + ", student=" + student + "]";
	}
	
	
	
}
