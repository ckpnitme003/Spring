package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bean.PatientDTO;

public class PatientDao implements IPatientDao {
	
	private static final String INSERT_QUERY="INSERT INTO CORONA_PAT VALUES(CUST_SEQ.NEXTVAL,?,?,?)";
	
	private DataSource ds;
	public PatientDao(DataSource ds) {
		this.ds=ds;
	}
	@Override
	public int insert(PatientDTO dto) throws Exception {
		int result=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(INSERT_QUERY)){
			ps.setString(1, dto.getPatName());
			ps.setString(2, dto.getPatAddrs());
			ps.setDouble(3, dto.getTotalBill());
			
			result=ps.executeUpdate();
			
		}catch(SQLException se) {
			throw se;
		}catch(Exception e) {
			throw e;
		}
		return result;
	}
}
