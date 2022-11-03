package com.nt.config;


import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@ComponentScan(basePackages = "com.nt")
@PropertySource("com/nt/commons/jdbc.properties")
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean("bds")
	public DataSource getDs() {
		
		//Drivermanager data source
		/*DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("jdbc.driver"));
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setPassword(env.getProperty("jdbc.password"));
		*/
		
		//apache dbcp2 data source
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName(env.getProperty("jdbc.driver"));
		bds.setUrl(env.getProperty("jdbc.url"));
		bds.setUsername(env.getProperty("jdbc.username"));
		bds.setPassword(env.getProperty("jdbc.password"));
		
		//Hikari cp2 data source
		/*HikariDataSource hkds=new HikariDataSource();
		hkds.setDriverClassName(env.getProperty("jdbc.driver"));
		hkds.setJdbcUrl(env.getProperty("jdbc.url"));
		hkds.setUsername(env.getProperty("jdbc.username"));
		hkds.setPassword(env.getProperty("jdbc.password"));*/
		
		//c3p0 data source
		/*ComboPooledDataSource cds=new ComboPooledDataSource();
		try {
			cds.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cds.setJdbcUrl(env.getProperty("jdbc.url"));
		cds.setUser(env.getProperty("jdbc.username"));
		cds.setPassword(env.getProperty("jdbc.password"));*/
		
		//proxool data source
		/*ProxoolDataSource pds=new ProxoolDataSource();
		pds.setDriver(env.getProperty("jdbc.driver"));
		pds.setDriverUrl(env.getProperty("jdbc.url"));
		pds.setUser(env.getProperty("jdbc.username"));
		pds.setPassword(env.getProperty("jdbc.password"));*/
		
		return bds;
	}
}
