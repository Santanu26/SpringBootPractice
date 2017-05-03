package com.shantanu.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shantanu.dto.RegistrationForm;

//Declare @Controller annotation Spring will consider it when handling incoming request
@Controller
public class RegisterController {
	private static final Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registrationPage() {
		LOGGER.debug("Rendering Registration Page...");
		return "registration";
	}

	
	// GET Result from UI
	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	public String userRegistration( @Valid RegistrationForm registrationForm , BindingResult result) {
		System.out.println("User Page");
		return "registration";
	}
}
