package com.nt.controller;

import com.nt.bean.PatientDTO;
import com.nt.service.IPatientMgmtService;

public class MainController {
	private IPatientMgmtService service;
	
	public MainController(IPatientMgmtService service) {
		this.service=service;
	}
	public String InsertRecord(PatientDTO dto)throws Exception {
		
		String result=null;
	
		result=service.registerCustomer(dto);
		return result;
	}
	
}
