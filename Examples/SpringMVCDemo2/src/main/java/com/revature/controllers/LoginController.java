package com.revature.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.view.RedirectView;
//import org.springframework.web.servlet.view.;

@Controller
public class LoginController {

	//deliver static resources from the endpoint "/login"
	@GetMapping(value="/login")
	public String getStaticLoginPage() {
		return "forward:/static/login.html";
	}
	
	//handle form data sent to "/login" -- other way to do it is to RedirectView
	@PostMapping(value="/login", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String handleFormRequest(@RequestBody MultiValueMap<String, String> formParams) {
		return "profile";
	}
	
//	@PostMapping(value="/login", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//	public RedirectView handleFormRequest(@RequestBody MultiValueMap<String, String> formParams) {
//		attributes.addFlashAttribute("username", formParams.getFirst("username"))
//		return "profile";
//	}
}
