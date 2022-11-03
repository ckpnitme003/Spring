package com.nt.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.component.Flipkart;

public class Test {
	public static void main(String[] args) {
		/*DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		Flipkart fk = factory.getBean("fpkt", Flipkart.class);*/
		
//    	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		Flipkart fk = ctx.getBean("fpkt", Flipkart.class);
//		Flipkart fk=ctx.getBean("com.nt.component.Flipkart",Flipkart.class);
		String result = fk.order(new String[] { "shirt", "pant" }, new double[] { 1000.0, 2000.0 });
		System.out.println(result);
	}
}
