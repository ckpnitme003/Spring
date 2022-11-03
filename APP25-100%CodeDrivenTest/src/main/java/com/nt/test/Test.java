package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.A;
import com.nt.cfgs.AppConfig;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		A a=ctx.getBean("a",A.class);
		System.out.println(a.getSum());
		System.out.println(a.msg());
		System.out.println(a.getToString());
	}
}
