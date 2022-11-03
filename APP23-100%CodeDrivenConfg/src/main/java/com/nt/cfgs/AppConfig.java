package com.nt.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.nt" )
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig-0 param constructor");
	}
	
	@Bean("ld")
	public LocalDateTime getTime() {
		System.out.println("AppConfig.getTime()");
		return LocalDateTime.now();
	}
	

}
