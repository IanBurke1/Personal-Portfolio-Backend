package com.ianburke.PersonalPortfolio_backend.model;

import java.util.List;

public class About {
	private String name;
	private String bio;
	private List<String> skills;

	// Constructors
	public About() {}
	
	public About(String name, String bio, List<String> skills) {
	    this.name = name;
	    this.bio = bio;
	    this.skills = skills;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

}
