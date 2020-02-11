package com.luv2code.coach1.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/athlete")
public class AthleteController {
	
	
	// add initbinder to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue of whitespace for validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("athlete", new Athlete());
		
		return "athlete-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(
			@Valid @ModelAttribute("athlete") Athlete theAthlete,
			BindingResult theBindingResult) {
		
		// log the input data
		System.out.println("Last name: |" + theAthlete.getLastName() +"|");
		
		if (theBindingResult.hasErrors() ) {
			return "athlete-form";
		}
		
		else {
			return "athlete-confirmation";
		}
	}
	
	
	
}
