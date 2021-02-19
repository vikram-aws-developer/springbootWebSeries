package com.springBootSeries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//exclude = {DataSourceAutoConfiguration.class }
@SpringBootApplication()
public class FirstWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstWebAppApplication.class, args);
		System.out.println("Welcome to Spring Boot Telugu Web Series");
	}

}
