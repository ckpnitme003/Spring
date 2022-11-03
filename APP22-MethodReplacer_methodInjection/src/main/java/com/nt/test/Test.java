package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankService;

public class Test {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("Test.main()");
		BankService service=ctx.getBean("bankService",BankService.class);
		
		double interestAmt=service.calculateInterest(1000, 10, 2);
		System.out.println(interestAmt);
		System.out.println(service.getClass()+" "+service.getClass().getSuperclass());
		int calculate=service.calc(10, 20);
		System.out.println(calculate);
		ctx.close();
	}
}
