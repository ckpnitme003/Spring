package com.nt.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource("classpath:com/nt/commons/Info.properties")
public class Employee {
	
	@Value("${emp.eno}")
	private Integer empNo;
	
	@Value("${emp.ename}")
	private String empName;
	
	@Value("${emp.eaddrs}")
	private String empAddrs;
	
	/*@Value("${os.name}")
	private String osName;
	
	@Value("${os.version}")
	private String osVersion;*/

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empAddrs=" + empAddrs +/* ", osName=" + osName
				+ ", osVersion=" + osVersion + */"]";
	}
	
	
}
