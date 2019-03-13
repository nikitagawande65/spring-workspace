package com.myapp.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;


@Configuration
@ComponentScan(basePackages="com.myapp.spring")
public class AppConfig {
	
	@Bean
	@Autowired
	public JdbcTemplate JdbcTemplate( DataSource dataSource) {
	return new JdbcTemplate(dataSource);
	}

	@Bean
	public DataSource dataSource()
	{
		HikariDataSource dataSource=
				new HikariDataSource();
		dataSource.setJdbcUrl("jdbc:h2:~/testdb");
		dataSource.setUsername("sa");
		dataSource.setAutoCommit(false);
		
		return dataSource;
	}
	
	
	

}
