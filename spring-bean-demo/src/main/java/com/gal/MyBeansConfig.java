package com.gal;

import javax.sql.DataSource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.gal.algo.Calc;
import com.gal.algo.MyCalc;
import com.mysql.cj.jdbc.MysqlDataSource;


@Configuration
public class MyBeansConfig {
	@Bean
	StringBuilder getStringBuilder() {
		return new StringBuilder("Bean from configuration");
	}
	@Bean
	@Primary
	Calc getCalc() {
		return new MyCalc();
	}
	@Bean(name ="calcNamesBean")
	Calc getCalc2() {
		return new MyCalc();
	}
	@Bean
	DataSource mysqldatasource() {
		MysqlDataSource ds=new MysqlDataSource();
		ds.setUrl("\"jdbc:mysql://localhost:3306/supplyproblemdb");
		ds.setUser("root");
		ds.setPassword("bhavya");
		return ds;
	}

}
