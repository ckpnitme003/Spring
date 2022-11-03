package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoterEligibilityCheck;

public class Test {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		VoterEligibilityCheck v=ctx.getBean("voting",VoterEligibilityCheck.class);
		
		String result=v.checkVotingEligibilty();
		System.out.println(result);
		
		ctx.close();
	}
}
