package com.app.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String login(@RequestParam("username") final String userName, @RequestParam("passwd") final String password) {
		return "Welcome";
	}

	@RequestMapping(value = "/")
	public String showLogin() {
		return "home";
	}

}
