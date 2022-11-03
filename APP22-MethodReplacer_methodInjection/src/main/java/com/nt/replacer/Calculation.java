package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class Calculation implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		int a=(int)args[0];
		int b=(int)args[1];
		System.out.println(obj.getClass()+" "+method.getName());
		return b-a;
	}
}
