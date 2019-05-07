package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudyAppController {
	
	//to bundle Angular app for use her,
	//ng build --prod --base-href=SpringMVCDemo/ --deploy
	@GetMapping(value="/study-app")
	public String getApp() {
		return "forward:/static/index.html";
	}

}
