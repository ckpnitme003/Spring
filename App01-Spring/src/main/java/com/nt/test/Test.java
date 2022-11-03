package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMsgGenerator;

public class Test {
	public static void main(String[] args) {
		//hold name & location of bean factory
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//create bean factory container(IOC container)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		//getting target class with dependent class with setter injection
		
		Object obj=factory.getBean("wmg");
		WishMsgGenerator generator=(WishMsgGenerator)obj;
		String result=generator.getWishMsg("Hari");
		System.out.println(result);
		
	}
}
