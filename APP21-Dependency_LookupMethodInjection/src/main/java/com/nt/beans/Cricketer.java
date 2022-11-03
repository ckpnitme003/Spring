package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource("com/nt/commons/Info.properties")
public abstract class Cricketer {
	
	@Value("${cktr.name}")
	private String name;
	
	@Value("${cktr.jercyNo}")
	private int jercyNo;
	
	@Lookup
	public abstract CricketBat getBat();
	
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
		
		CricketBat bat=getBat();
		System.out.println(name+" with jercy number "+jercyNo+" is batting has done score ="+bat.scoreRun());
	}
	
}
