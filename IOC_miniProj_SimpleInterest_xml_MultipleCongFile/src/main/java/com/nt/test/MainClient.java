package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class MainClient {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Customer name : ");
		String name=scn.nextLine();
		System.out.print("Enter Customer address : ");
		String addrs=scn.nextLine();
		System.out.print("Enter principle amt : ");
		String pamt=scn.nextLine();
		System.out.print("Enter rate of interest : ");
		String rate=scn.nextLine();
		System.out.print("Enter time(in year) : ");
		String time=scn.nextLine();
		
		//create vo class obj
		CustomerVO custVo=new CustomerVO();
		custVo.setCname(name);
		custVo.setCaddrs(addrs);
		custVo.setPamt(pamt);
		custVo.setRate(rate);
		custVo.setTime(time);
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		MainController controller=factory.getBean("custController",MainController.class);
		try {
			String result=controller.InsertRecord(custVo);
			System.out.println(result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
