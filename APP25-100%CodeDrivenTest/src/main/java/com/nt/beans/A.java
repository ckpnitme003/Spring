package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a")
public class A {
	@Autowired
	private C c;
	
	@Autowired
	private LocalDateTime ldt;
	
	@Autowired
	private String tos;
	
	
	public A() {
		System.out.println("A-0-param Constructor");
	}
	
	public int getSum() {
		return c.getSumfromB();
	}
	public String msg() {
		return "time is :"+ldt;
	}
	public String getToString() {
		return "result :"+tos;
	}
}
