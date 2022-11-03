package com.nt.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "com.nt")
@PropertySource(value = "com/nt/commons/Info.properties")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig-0-param Constructor");
	}
	@Bean("ldt")
	public LocalDateTime getTime() {
		return LocalDateTime.now();
	}
	@Bean("tostring")
	public String toString() {
		return "x+y";
	}
}
