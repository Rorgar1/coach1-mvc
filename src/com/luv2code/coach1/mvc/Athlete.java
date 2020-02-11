package com.luv2code.coach1.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Athlete {
	
	private String firstName;
	
	@NotNull(message="field is required")
	@Size(min=1, message="field is required")
	private String lastName;
	
	private String country;
	
	private String preferredSport;
	
	private String[] practiceDay;
	
	@NotNull(message="required field")
	@Min(value=0, message="must be zero or greater")
	@Max(value=5, message="limit of 5 passes")
	private Integer freePasses;
	
	@NotNull(message="required field")
	@Pattern(regexp="^[0-9]{2}", message="Enter 2-digit year")
	private String age;
	
	
	
	
	public Athlete() { }
	

	
	// getters and setters
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

	public String getPreferredSport() {
		return preferredSport;
	}

	public void setPreferredSport(String preferredSport) {
		this.preferredSport = preferredSport;
	}

	public String[] getPracticeDay() {
		return practiceDay;
	}

	public void setPracticeDay(String[] practiceDay) {
		this.practiceDay = practiceDay;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	
}
