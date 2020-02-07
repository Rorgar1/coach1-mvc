package com.luv2code.coach1.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloCoachController {
	
	// need a controller method to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return"hellocoach-form";
	}
	
	// need controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "hellocoach";
	}
	
	// controller method to read form data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String cheerLoud(HttpServletRequest request, Model model) {
		
		// read the request parameter from HTML form
		String theName = request.getParameter("coachName");
		
		// convert data to upper case
		theName = theName.toUpperCase();
		
		// create message
		String result = " LET'S WIN, COACH " + theName + "!";
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "hellocoach";
	}
	
	
	
	

}
