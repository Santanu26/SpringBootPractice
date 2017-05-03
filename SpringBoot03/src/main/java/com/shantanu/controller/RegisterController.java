package com.shantanu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Declare @Controller annotation Spring will consider it when handling incoming request
@Controller
public class RegisterController {
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registrationPage() {
		return "registration";
	}
}
