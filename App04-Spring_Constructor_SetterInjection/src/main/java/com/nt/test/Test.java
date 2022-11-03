package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMsgGenerator;

public class Test {
	public static void main(String[] args) {

		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Object obj=factory.getBean("wmg");
		WishMsgGenerator generator=(WishMsgGenerator)obj;
		
		System.out.println(generator.getWishMsg("hk"));
	}
}
