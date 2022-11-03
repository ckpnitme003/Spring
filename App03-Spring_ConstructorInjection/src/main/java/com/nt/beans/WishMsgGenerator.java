package com.nt.beans;

import java.time.LocalDateTime;
import java.util.Date;

public class WishMsgGenerator {
	
	//dependency as HAS-A property
	private Date date;
	
	public WishMsgGenerator() {
		System.out.println("WishMsgGenerator-0 param contructor");
	}
	
	public WishMsgGenerator(Date date) {
		this.date=date;
		System.out.println("WishMsgGenerator-1 param contructor");
	}
	
	/*//setter injection of dependencies
	public void setDate(Date date) {
		System.out.println("WishMsgGenerator.setDate()");
		this.date=date;
	}*/
	public String getWishMsg(String type) {
		String result=null;
		int hour=date.getHours();
		if(hour<12)
			result="Good morning "+type;
		else if(hour<16)
			result="Good afternoon "+type;
		else if(hour<20)
			result="Good evening "+type;
		else
			result="Good night "+type;
		
		return result;
			
	}
}
