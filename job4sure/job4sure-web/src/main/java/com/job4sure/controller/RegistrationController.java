package com.job4sure.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.job4sure.model.Registration;
import com.job4sure.service.RegistrationService;
import com.job4sure.util.IConstant;
import com.job4sure.validator.RegistrationValidator;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@Autowired
	private RegistrationValidator registrationValidator;

	@RequestMapping("/registration")
	public String showRegistration(Map<String, Object> map,@RequestParam(required = false) String message,ModelMap model) {
		map.put("Registration", new Registration());
		model.addAttribute("message", message);
		return "registration";
	}
	
	@RequestMapping(value = "/saveRegistration", method =  RequestMethod.POST)
	private String saveUserInformation(@ModelAttribute("Registration") Registration registration,ModelMap model,BindingResult result) {
		boolean status = false;
		registrationValidator.validate(registration, result);
		if (result.hasErrors()) {
			return "registration";
		}
		status = registrationService.saveUserInformation(registration);
		if (status) {
			model.addAttribute("message", IConstant.REGISTRATION_SUCCESS_MESSAGE);
		} else {
			model.addAttribute("message", IConstant.REGISTRATION_FAILURE_MESSAGE);
		}
		return "redirect:/registration";
	}
	
	/*@RequestMapping(value = "/verifyUserEmailId", method = { RequestMethod.GET })
	@ResponseBody
	public boolean verifyUserEmailId(@RequestParam(required = false) String emailId) {
		System.out.println("saf" + emailId);
		boolean status = false;
		status = registrationService.verifyUserEmailId(emailId);
		return status;

	}*/
}
