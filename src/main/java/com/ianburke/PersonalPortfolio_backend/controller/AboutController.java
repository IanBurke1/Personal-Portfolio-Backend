package com.ianburke.PersonalPortfolio_backend.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ianburke.PersonalPortfolio_backend.model.About;

@RestController
@RequestMapping("/api/about")
public class AboutController {
	   @GetMapping
	    public About getAbout() {
	        About about = new About();
	        about.setName("Ian Burke");
	        about.setBio("Testing 1 2 3"
	        		+ ".");
	        about.setSkills(Arrays.asList("Java", "Spring Boot", "React", "HTML", "CSS", "JavaScript"));
	        return about;
	    }
}
