package com.luv2code.coach1.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/athlete")
public class AthleteController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create new student object
		Athlete theAthlete = new Athlete();
		
		// add student object to model
		theModel.addAttribute("athlete", theAthlete);
		
		return "athlete-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("athlete") Athlete theAthlete) {
		
		// log the input data
		System.out.println("theAthlete: " + theAthlete.getFirstName() + " " + theAthlete.getLastName());
		return "athlete-confirmation";
	}
	
	
	
	
}
