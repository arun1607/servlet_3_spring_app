package com.app.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.learning.model.Login;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("username") final String userName,
			@RequestParam("passwd") final String password, final Model model) {
		Login login = new Login();
		login.setUserName(userName);
		model.addAttribute("login", login);
		return "welcome";
	}

	@RequestMapping(value = "/")
	public String showLogin() {
		return "home";
	}

}
