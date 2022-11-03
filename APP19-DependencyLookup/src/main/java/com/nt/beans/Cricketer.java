package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component("cktr")
@PropertySource("com/nt/commons/Info.properties")
public class Cricketer {
	
	@Value("${cktr.name}")
	private String name;
	
	@Value("${cktr.jercyNo}")
	private int jercyNo;
	
	public Cricketer() {
		System.out.println("Cricketer -0 param constructor");
	}
	
	public void bowling() {
		System.out.println(name+" with jercy number "+jercyNo+" is bowling");
	}
	public void fielding() {
		System.out.println(name+" with jercy number "+jercyNo+" is fielding");
	}
	public void wicketKeeping() {
		System.out.println(name+" with jercy number "+jercyNo+" is wicket keeping");
	}
	public void batting() {
		//create a container for dependency lookup
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		CricketBat bat=ctx.getBean("bat",CricketBat.class);
		System.out.println(name+" with jercy number "+jercyNo+" is batting has done score ="+bat.scoreRun());
	}
	
}
