package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bean.PatientDTO;
import com.nt.controller.MainController;

public class MainClient {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter patient name : ");
		String name=scn.nextLine();
		System.out.print("Enter patient address : ");
		String addrs=scn.nextLine();
		System.out.print("Enter per day charge : ");
		Double charge=scn.nextDouble();
		System.out.print("Enter no of day staying : ");
		Integer day =scn.nextInt();
		
		//create bean class obj
		PatientDTO patDTO=new PatientDTO();
		patDTO.setPatName(name);
		patDTO.setPatAddrs(addrs);
		patDTO.setPerdayCharge(charge);
		patDTO.setDayNo(day);
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		MainController controller=factory.getBean("patController",MainController.class);
		try {
			String result=controller.InsertRecord(patDTO);
			System.out.println(result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
