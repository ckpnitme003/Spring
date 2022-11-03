package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbean.Employee;


public class Test {
	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Employee e=ctx.getBean("emp",Employee.class);
		
		System.out.println(e);
		
		Environment env=ctx.getEnvironment();
		System.out.println(env.getProperty("emp.ename"));
		
//		System.out.println(System.getProperties());
	}
}
