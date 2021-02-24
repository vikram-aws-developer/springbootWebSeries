package com.springBootSeries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

//exclude = {DataSourceAutoConfiguration.class }
@SpringBootApplication()
@EnableWebSecurity
public class FirstWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstWebAppApplication.class, args);
		System.out.println("Welcome to Spring Boot Telugu Web Series");
	}

}
