package com.nt.dao;

import com.nt.bean.PatientDTO;

public interface IPatientDao {
	public int insert(PatientDTO bo)throws Exception;
}
