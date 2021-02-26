package com.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class CollegeDatabaseConfig {
	

	@Bean
	DataSource datasourceDetails() {
	DriverManagerDataSource datasource = new DriverManagerDataSource();
	datasource.setDriverClassName("com.mysql.jdbc.Driver");
	datasource.setUrl("jdbc:mysql://localhost:3306/contact_db");
	datasource.setUsername("root");
	datasource.setPassword("root");
	return datasourceDetails() ;
	}
}
