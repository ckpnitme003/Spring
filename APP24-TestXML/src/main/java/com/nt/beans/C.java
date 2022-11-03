package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("c")
public class C {
	@Autowired
	private B b;
	
	public C() {
		System.out.println("C-0-param constructor");
	}
	public int getSumfromB() {
		return b.sum();
	}
}
