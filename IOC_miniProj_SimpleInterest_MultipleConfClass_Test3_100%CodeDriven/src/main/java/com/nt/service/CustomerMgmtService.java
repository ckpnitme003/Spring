//service class
package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDao;
import com.nt.dto.CustomerDTO;

@Service("custService")
public class CustomerMgmtService implements ICustomerMgmtService{
	
	@Autowired
//	@Qualifier("dao")
	private ICustomerDao dao;
	
	
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
