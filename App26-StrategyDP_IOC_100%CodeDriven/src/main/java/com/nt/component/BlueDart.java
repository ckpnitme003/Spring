package com.nt.component;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bDart")

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
