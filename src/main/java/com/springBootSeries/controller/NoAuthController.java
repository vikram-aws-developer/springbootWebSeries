package com.springBootSeries.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class NoAuthController {

	@RequestMapping(value="noAuth/welcomeMessage")
	public String welcomeMessage() {
		return "This is company public website";
	}
	
}
