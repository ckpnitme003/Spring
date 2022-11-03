package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("bankService")
public class BankService {
	public double calculateInterest(double p,double r,double t) {
		System.out.println("BankService-C.I");
		
		return p*Math.pow((1+r/100), t)-p;
	}
	public int calc(int a,int b) {
		System.out.println("BankService.Calc()");
		return a+b;
	}
}
