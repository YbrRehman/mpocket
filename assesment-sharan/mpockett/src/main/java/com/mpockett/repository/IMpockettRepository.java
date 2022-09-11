package com.mpockett.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mpockett.model.Loan;

@Repository
public interface IMpockettRepository extends JpaRepository<Loan, Integer>{
	
	List<Loan>findAll();
	Loan findById(int loanId);
	List<Loan> findByLoanName(String loanName);
	@Query("from Loan l inner join l.student ls where ls.studentName=?1")
	List<Loan>findByStudentStudentName(String name);
	@Query(value="select * from loan l inner join loan_student ls on l.loan_id=ls.loan_loan_id inner join student_documents sd on ls.student_student_id=sd.student_id inner join documents d on sd.documents_documents_id=d.document_id",nativeQuery = true)
	List<Loan>findByStudentDocumentName(String docName);
	

}
