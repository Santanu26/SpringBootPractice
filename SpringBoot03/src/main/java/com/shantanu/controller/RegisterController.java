package com.shantanu.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Declare @Controller annotation Spring will consider it when handling incoming request
@Controller
public class RegisterController {
	private static final Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registrationPage() {
		LOGGER.debug("Rendering Registration Page...");
		return "registration";
	}
}
