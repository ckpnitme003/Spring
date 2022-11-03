package com.nt.beans;

import java.util.Date;

public class VoterEligibilityCheck {
	
	private String name;
	private int age;
	private Date verifiedOn;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//life cycle method(initialization logic)
	public void myInit() {
		verifiedOn=new Date();
		System.out.println("My Init method "+verifiedOn);
		if(name==null ||age<=0)
			throw new IllegalArgumentException("name or age is invalid");
	}
	public String checkVotingEligibilty() {
		System.out.println("checking voter eligibilty "+verifiedOn);
		
		if(age<18)
			return name+" ,u are not eligible for voting";
		else
			return name+" ,u are eligible for voting";
			
	}
	//life cycle method(destroy logic)
	public void myDestroy() {
		System.out.println("destroy method");
		name=null;
		age=0;
		verifiedOn=null;
	}
	
}
