package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.A;

public class Test {
	public static void main(String[] args) {

		ClassPathResource res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Object obj=factory.getBean("a1");
		A a=(A)obj;
		
		System.out.println(a);
	}
}
