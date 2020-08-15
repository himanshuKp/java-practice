package org.himanshu.config;

import javax.sql.DataSource;

import org.himanshu.dao.AppDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = 
				new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/sample");
		dataSource.setUsername("postgres");
		dataSource.setPassword("root123");
		return dataSource;
	}
	
	@Bean(name = "DAOBean")
	public AppDAOImpl AppDAO() {	
		return new AppDAOImpl(getDataSource());
	}
	
}
