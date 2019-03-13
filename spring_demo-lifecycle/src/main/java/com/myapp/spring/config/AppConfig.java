package com.myapp.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

//this class resplaces traditional applicationContext.xml
@Configuration
@ComponentScan(basePackages="com.myapp.spring")
@EnableTransactionManagement
public class AppConfig {
	
	//<bean id="dataSource" class="DriverManagerDataSource">
	//<property name="driverClassName value=""/">
	//<property name="url" value=""/>
	//<property name="username" value=""/>
	//</bean>
	@Bean("connection1")
	public DataSource dataSource()
	{
		
		DriverManagerDataSource dataSource= new DriverManagerDataSource("jdbc:h2:~/testdb", "sa","");
		return dataSource;
	}
	
	@Bean("connection2")
	public DataSource dataSource1()
	{
		
		SingleConnectionDataSource dataSource=
				new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:h2:~/testdb");
		dataSource.setUsername("sa");
		
		return dataSource;
	}
	
	//<bean id="jdbcTemplate" calss="Jdbctemplate" autowire="byTyepe">
	@Bean
	@Autowired
public JdbcTemplate JdbcTemplate(@Qualifier("connection3") DataSource dataSource) {
	return new JdbcTemplate(dataSource);
}

	@Bean("connection3")
	public DataSource dataSource2()
	{
		HikariDataSource dataSource=
				new HikariDataSource();
		dataSource.setJdbcUrl("jdbc:h2:~/testdb");
		dataSource.setUsername("sa");
		dataSource.setAutoCommit(false);
		
		return dataSource;
	}
	
	
	@Bean
	@Autowired
	public DataSourceTransactionManager transactionManager(@Qualifier("connection3")DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

}
