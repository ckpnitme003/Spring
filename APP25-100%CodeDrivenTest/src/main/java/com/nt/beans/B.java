package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b")
public class B {
	
	@Value("${x}")
	private int x;
	
	@Value("${y}")
	private int y;
	
	public B() {
		System.out.println("B-0-param constructor");
	}
	//b.method
	public int sum() {
		return x+y;
	}
}
