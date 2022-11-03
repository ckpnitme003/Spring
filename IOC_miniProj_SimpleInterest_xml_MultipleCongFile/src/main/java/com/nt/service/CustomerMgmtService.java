package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDao;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtService implements ICustomerMgmtService{
	
	private ICustomerDao dao;
	
	public CustomerMgmtService(ICustomerDao dao) {
		this.dao=dao;
	}
	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		int count=0;
		String result=null;
		CustomerBO bo=new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCaddrs(dto.getCaddrs());
		bo.setPamt(dto.getPamt());
		
		double intramt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0;
		bo.setIntramt(intramt);
		
		
			count=dao.insert(bo);
			if(count==0)
				result="customer info not saved";
			else
				result="customer info is saved";

		return result;
	}
}
