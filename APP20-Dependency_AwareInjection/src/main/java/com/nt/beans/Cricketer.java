package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component("cktr")
@PropertySource("com/nt/commons/Info.properties")
public class Cricketer {//implements ApplicationContextAware {
	
	@Value("${cktr.name}")
	private String name;
	
	@Value("${cktr.jercyNo}")
	private int jercyNo;
	
	@Autowired
	private ApplicationContext ctx;
	
	public Cricketer() {
		System.out.println("Cricketer -0 param constructor");
	}
		
	
	/*
	private ApplicationContext ctx;
	
		@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer-setApplicationContext()");
	this.ctx=ctx;	
	}*/
	
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
		
		CricketBat bat=ctx.getBean("bat",CricketBat.class);
		System.out.println(name+" with jercy number "+jercyNo+" is batting has done score ="+bat.scoreRun());
	}
	
}
