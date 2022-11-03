package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoterEligibilityCheck implements InitializingBean,DisposableBean {
	
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
	@Override
	public void afterPropertiesSet() throws Exception {
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
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method");
		name=null;
		age=0;
		verifiedOn=null;
		
	}
	
	
}
