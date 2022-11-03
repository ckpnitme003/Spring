package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nt")
@PropertySource("com/nt/commons/jdbc.properties")
@Import({PersistanceConfig.class,ServiceConfig.class,ControllerConfig.class})
public class AppConfig {

	
}
