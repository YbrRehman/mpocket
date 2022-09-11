package com.mpockett.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpockett.model.Loan;
import com.mpockett.repository.IMpockettRepository;

@Service
public class MpockettServiceImpl implements IMpockettService {

	@Autowired
	IMpockettRepository mpockettRepository;
	@Override
	public void addLoan(Loan loan) {
		mpockettRepository.save(loan);
	}

	@Override
	public void updateLoan(Loan loan) {
		mpockettRepository.save(loan);
	}

	@Override
	public void deleteLoan(int loanId) {
		mpockettRepository.deleteById(loanId);
	}

	@Override
	public List<Loan> getAll() {
		return mpockettRepository.findAll();
	}

	@Override
	public Loan getById(int loanId) {
		return mpockettRepository.findById(loanId);
	}

	@Override
	public List<Loan> getByLoanName(String loanName) {
		return mpockettRepository.findByLoanName(loanName);
	}

}
