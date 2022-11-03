package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


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

	
	
	//for AnnotationDriven approch
	@PostConstruct
	public void myInit()  {
		
		System.out.println("My Init method -1 anno based");
		
		
	}
	//for declarative approch
	public void myInitilize()  {
		
		System.out.println("My Initilize method -3 declarative");
		
		
	}
	//for programatic approch
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set method-2 programatic ");
				
	}
	
	
	//priority level
	//anno driven >  code driven > declarative
	
	
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
	}

	
}
