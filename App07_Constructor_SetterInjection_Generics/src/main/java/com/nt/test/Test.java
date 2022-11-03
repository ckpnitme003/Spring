package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Student;

public class Test {
	public static void main(String[] args) {

//		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		ClassPathResource res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Student s=factory.getBean("st", Student.class);
		System.out.println(s);
	}
}
