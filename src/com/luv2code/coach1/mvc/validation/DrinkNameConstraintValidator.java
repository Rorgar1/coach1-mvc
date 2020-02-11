package com.luv2code.coach1.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DrinkNameConstraintValidator implements ConstraintValidator<DrinkName, String> {

	private String drinkPrefix;
	
	
	@Override
	public void initialize(DrinkName theDrinkName) {
		drinkPrefix = theDrinkName.value();	
	}

	@Override
	public boolean isValid(String theName, ConstraintValidatorContext theConstraintValidatorContext) {
		
		
		boolean result;
		
		if (theName != null) {
			result = theName.startsWith(drinkPrefix);
		}
		else {
			result = true;
		}
		return result;
	}
	
	
	

}
