package com.luv2code.coach1.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Athlete {
	
	private String firstName;
	
	@NotNull(message="field is required")
	@Size(min=1, message="field is required")
	private String lastName;
	
	private String country;
	
	public Athlete() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	
}
