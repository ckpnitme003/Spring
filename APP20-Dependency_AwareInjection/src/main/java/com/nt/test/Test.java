package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class Test {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("Test.main()");
		Cricketer cktr=ctx.getBean("cktr",Cricketer.class);
		
		cktr.bowling();
		cktr.fielding();
		cktr.wicketKeeping();
		cktr.batting();
		System.out.println(cktr.getClass());
		ctx.close();
	}
}
