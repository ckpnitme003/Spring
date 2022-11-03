package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {
	private ICustomerMgmtService service;
	
	public MainController(ICustomerMgmtService service) {
		this.service=service;
	}
	public String InsertRecord(CustomerVO vo)throws Exception {
		
		String result=null;
		
		CustomerDTO dto=new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCaddrs(vo.getCaddrs());
		dto.setPamt(Double.parseDouble(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Double.parseDouble(vo.getTime()));
		
		result=service.registerCustomer(dto);
		return result;
	}
	
}
