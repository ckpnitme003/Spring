package com.nt.component;

public class BlueDart implements Courier {
	public BlueDart() {
		// TODO Auto-generated constructor stub
		System.out.println("BlueDart 0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return oid+" is delivered by BlueDart Courier service";
	}
}
