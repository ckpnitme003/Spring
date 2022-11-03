package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.singleton.Printer;

public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		Printer p1=factory.getBean("st",Printer.class);
		Printer p2=factory.getBean("st1",Printer.class);
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		
	}
}
