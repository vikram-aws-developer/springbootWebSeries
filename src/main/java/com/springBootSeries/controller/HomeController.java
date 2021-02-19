package com.springBootSeries.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value="/homePage")
	public String HomePage() {
		return "Welcome to Spring Boot Telugu Web Series";
	}
}
