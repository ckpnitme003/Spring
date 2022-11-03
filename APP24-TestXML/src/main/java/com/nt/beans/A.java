package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a")
public class A {
	@Autowired
	private C c;
	public A() {
		System.out.println("A-0-param Constructor");
	}
	
	public int getSum() {
		return c.getSumfromB();
	}
}
