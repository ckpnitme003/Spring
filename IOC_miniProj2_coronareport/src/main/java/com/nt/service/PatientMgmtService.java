package com.nt.service;

import com.nt.bean.PatientDTO;
import com.nt.dao.IPatientDao;

public class PatientMgmtService implements IPatientMgmtService{
	
	private IPatientDao dao;
	
	public PatientMgmtService(IPatientDao dao) {
		this.dao=dao;
	}
	@Override
	public String registerCustomer(PatientDTO dto) throws Exception {
		int count=0;
		String result=null;
		
		
		double bill=dto.getPerdayCharge()*dto.getDayNo();
		dto.setTotalBill(bill);
		
		
			count=dao.insert(dto);
			if(count==0)
				result="customer info not saved";
			else
				result="customer info is saved and total bill amt is "+bill;

		return result;
	}
}
