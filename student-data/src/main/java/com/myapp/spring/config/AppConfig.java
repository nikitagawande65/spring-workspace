package com.myapp.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.myapp.spring")
public class AppConfig {
	
	@Bean
	public DataSource dataSource() {
		HikariDataSource dataSource=new HikariDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setJdbcUrl("jdbc:h2:~/testdb");
		dataSource.setUsername("sa");
		dataSource.setAutoCommit(false);
		return dataSource;
	}
	
//@Autowired
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate template= new JdbcTemplate(dataSource);
		
		return template;
	}
	@Bean
	//@Autowired
	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean
	public InternalResourceViewResolver
	setupViewResolver()
	{
		InternalResourceViewResolver viewResolver=new
				InternalResourceViewResolver("/ui/jsp/",".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}

	
}
