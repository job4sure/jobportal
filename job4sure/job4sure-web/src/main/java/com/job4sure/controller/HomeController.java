package com.job4sure.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showWelcomePage() {
		return "welcome";
	}

	@RequestMapping(value = "/OpenloginPage", method = RequestMethod.GET)
	public String showloginPage() {
		return "loginPage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout,
			HttpServletRequest request, Model model) {

		if (error != null) {
			model.addAttribute("error", "SPRING_SECURITY_LAST_EXCEPTION");
		}
		if (logout != null) {
			model.addAttribute("msg", "You've been logged out successfully.");
		}

		return "loginPage";
	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String showsuccesspage(HttpServletRequest request,
			Principal principal) {
		boolean isUser = request.isUserInRole("USER");
		boolean isComp = request.isUserInRole("COMP");
		if (isUser) {
			return "redirect:/user";
		} else if (isComp) {
			return "redirect:/comp";
		} else {
			return "loginPage";
		}

	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String showUserPage() {
		System.out
				.println("+++++++++++++++++++++++++++=================************");
		return "userPage";
	}

	@RequestMapping(value = "/comp", method = RequestMethod.GET)
	public String showCompPage() {
		return "compPage";
	}

}
