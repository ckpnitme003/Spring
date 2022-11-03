package com.nt.component;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	//HAS-A (dependent class)
	@Autowired
	@Qualifier("bDart")
	private Courier courier;
	
	/*public void setCourier(Courier courier) {
		System.out.println("Flipkart:setCourier()");
		this.courier=courier;
	}*/
	public String order(String pname[],double price[]) {
		double billAmt=0.0;
		for(double b:price) {
			billAmt=billAmt+b;
		}
		int oid=new Random().nextInt(1000);
		return Arrays.toString(pname)+" is products of bill amt is :"+billAmt+" ---- "+courier.deliver(oid);
	}
}
