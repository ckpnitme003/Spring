package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.component.Flipkart;
import com.nt.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
				Flipkart fk = ctx.getBean("fpkt", Flipkart.class);
				String result = fk.order(new String[] { "shirt", "pant" }, new double[] { 1000.0, 2000.0 });
				System.out.println(result);
	}
}
