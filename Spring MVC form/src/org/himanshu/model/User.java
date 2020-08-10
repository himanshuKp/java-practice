package org.himanshu.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class User {
	@Size(min = 5, max = 10, message = "Enter the name between 5 to 10 characters")
	private String name;
	private String gender;
	private String country;
	@Email(regexp = ".+@.+\\..+")
	private String introduction;
	private String visitedCountry[];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String[] getVisitedCountry() {
		return visitedCountry;
	}
	public void setVisitedCountry(String[] visitedCountry) {
		this.visitedCountry = visitedCountry;
	}
	
	
}
