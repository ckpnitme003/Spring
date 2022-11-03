package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.cfgs.AppConfig;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx
									=new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
				String result=generator.getMessage("raja");
		
		System.out.println("Result :"+result);
		
		
	}
}
