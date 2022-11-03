package com.nt.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class CricketBat {
	
	public CricketBat() {
		System.out.println("CricketBat-0 param constructor");
	}
	public int scoreRun() {
		return new Random().nextInt(200);
	}
}
