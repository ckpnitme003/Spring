package com.nt.component;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Courier {
	public DHL() {
		System.out.println("DHL 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return oid+" is deliver using DHL courier service";
	}
}
