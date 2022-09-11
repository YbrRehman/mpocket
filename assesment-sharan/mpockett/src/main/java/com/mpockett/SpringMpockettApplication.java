package com.mpockett;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mail.MailProperties;

import com.mpockett.model.Address;
import com.mpockett.model.Documents;
import com.mpockett.model.Loan;
import com.mpockett.model.Student;
import com.mpockett.service.IMpockettService;
import com.mpockett.service.MpockettServiceImpl;

@SpringBootApplication
public class SpringMpockettApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringMpockettApplication.class, args);
	}
	
	IMpockettService mpockettService;
	@Autowired
	public void setMpockettService(IMpockettService mpockettService) {
		this.mpockettService = mpockettService;
	}
	@Autowired
	MpockettServiceImpl mpockettServiceImpl;
	

	@Override
	public void run(String... args) throws Exception {
		
		Address address1=new Address("J.p Nagar","Bangalore","karntaka",506224);
		
		Documents document1=new Documents("Aadharcard");
		List<Documents>documents=new ArrayList<>();
		documents.add(document1);
		List<Student> student1=Arrays.asList( new Student("Alok","JBIET",address1,documents));
		Loan loan1=new Loan("slicepay",5000,5,student1);
		mpockettService.addLoan(loan1);
		
	}

}
