package com.nt.component;

public class DTDC implements Courier {
	public DTDC() {
		// TODO Auto-generated constructor stub
		System.out.println("DTDC 0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return oid+" is delivered by DTDC Courier service";
	}
}
