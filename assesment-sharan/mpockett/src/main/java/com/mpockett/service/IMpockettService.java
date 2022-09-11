package com.mpockett.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mpockett.model.Loan;

@Service
public interface IMpockettService {

	void addLoan(Loan loan);
	void updateLoan(Loan loan);
	void deleteLoan(int loan_id);
	
	List<Loan>getAll();
	Loan getById(int loanId);
	List<Loan>getByLoanName(String loanName);
	
}
