package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Calculator;

public class Test {
	public static void main(String[] args) {
		//hold name and location of cfg file
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//create IOC container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		//get target class
		Calculator cal=(Calculator)factory.getBean("calc");
		
		System.out.println("sum of 20,5 ="+cal.sum(20, 5));
		System.out.println("sub of 20,5 ="+cal.sub(20, 5));
		System.out.println("mul of 20,5 ="+cal.mul(20, 5));
		System.out.println("div of 20,5 ="+cal.div(20, 5));
		
	}
}
