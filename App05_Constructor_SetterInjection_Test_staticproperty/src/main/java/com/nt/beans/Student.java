package com.nt.beans;

public class Student {
	private static int sno;
	private static String sname;
	
	public Student(int sno,String sname) {
		Student.sno=sno;
		Student.sname=sname;
	}
	public static void setSno(int sno) {
		Student.sno = sno;
	}
	public static void setSname(String sname) {
		Student.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sno="+sno+",sname="+sname+"]";
	}
	
	
}
