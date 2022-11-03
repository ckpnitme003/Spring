package com.nt.bean;

public class PatientDTO {
	private String patName;
	private String patAddrs;
	private Double perdayCharge;
	private Integer dayNo;
	private Double totalBill;
	
	public Double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(Double totalBill) {
		this.totalBill = totalBill;
	}
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public String getPatAddrs() {
		return patAddrs;
	}
	public void setPatAddrs(String patAddrs) {
		this.patAddrs = patAddrs;
	}
	public Double getPerdayCharge() {
		return perdayCharge;
	}
	public void setPerdayCharge(Double perdayCharge) {
		this.perdayCharge = perdayCharge;
	}
	public Integer getDayNo() {
		return dayNo;
	}
	public void setDayNo(Integer dayNo) {
		this.dayNo = dayNo;
	}	
}
