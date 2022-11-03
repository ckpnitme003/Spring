package com.nt.singleton;

public class Printer {
	private static Printer INSTANCE;
	private Printer() {
		System.out.println("0-param constructor");
	}
	public static Printer getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Printer();
		}
		return INSTANCE;
	}
}
