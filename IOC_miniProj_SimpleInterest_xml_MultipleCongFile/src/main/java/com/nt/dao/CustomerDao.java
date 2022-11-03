package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerDao implements ICustomerDao {
	
	private static final String INSERT_QUERY="INSERT INTO CUST_INFO VALUES(CUST_SEQ.NEXTVAL,?,?,?,?)";
	
	private DataSource ds;
	public CustomerDao(DataSource ds) {
		this.ds=ds;
	}
	@Override
	public int insert(CustomerBO bo) throws Exception {
		int result=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(INSERT_QUERY)){
			ps.setString(1, bo.getCname());
			ps.setString(2, bo.getCaddrs());
			ps.setDouble(3, bo.getPamt());
			ps.setDouble(4, bo.getIntramt());
			
			result=ps.executeUpdate();
			
		}catch(SQLException se) {
			throw se;
		}catch(Exception e) {
			throw e;
		}
		return result;
	}
}
