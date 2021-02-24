package com.springBootSeries.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HomeController {

	@RequestMapping(value="AuthRequired/homePage")
	public String HomePage() {
		return "you are seeing this web page because you had successfull basic authentication";
	}
}
