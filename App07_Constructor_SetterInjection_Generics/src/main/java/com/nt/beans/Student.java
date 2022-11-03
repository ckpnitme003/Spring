package com.nt.beans;

public class Student {
	private int sno;
	private String sname;
	private String addrs;
	private double avg;
	
	//zero param constructor
	public Student() {
		System.out.println("0-param constructor");
	}
	//4 -param constructor
	public Student(int sno, String sname, String addrs) {
		System.out.println("3-param constructor");
		this.sno = sno;
		this.sname = sname;
		this.addrs = addrs;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", addrs=" + addrs + ", avg=" + avg + "]";
	}
	
	
}
