package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class Test {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Cricketer cktr=ctx.getBean("cktr",Cricketer.class);
		
		cktr.bowling();
		cktr.fielding();
		cktr.wicketKeeping();
		cktr.batting();
		
		ctx.close();
	}
}
