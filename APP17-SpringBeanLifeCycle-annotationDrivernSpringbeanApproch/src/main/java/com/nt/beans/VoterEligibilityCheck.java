package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("voting")
public class VoterEligibilityCheck  {
	
	@Value("${person.name}")
	private String name;
	
	@Value("${person.age}")
	private int age;
	
//	@Autowired
	private Date date;
	
	/*@Autowired
	public VoterEligibilityCheck(Date date) {
		System.out.println("=======");		
		this.date=date;
		System.out.println("=======");
	}*/
	
	@Autowired
	public void setDate(Date date) {
		System.out.println("=======");		
		this.date=date;
		System.out.println("=======");
	}
	private Date verifiedOn;
	
	@PostConstruct
	public void myInit()  {
		verifiedOn=new Date();
		System.out.println("My Init method "+verifiedOn);
		if(name==null ||age<=0)
			throw new IllegalArgumentException("name or age is invalid");
		
	}
	
	public String checkVotingEligibilty() {
		System.out.println("checking voter eligibilty "+verifiedOn);
		System.out.println(date);
		if(age<18)
			return name+" ,u are not eligible for voting";
		else
			return name+" ,u are eligible for voting";
			
	}
	@PreDestroy
	public void destroy()  {
		System.out.println("destroy method");
		name=null;
		age=0;
		verifiedOn=null;
		
		
		
	}
	
	
}
