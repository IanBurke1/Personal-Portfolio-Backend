package com.ianburke.PersonalPortfolio_backend.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ianburke.PersonalPortfolio_backend.model.Project;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @GetMapping
    public List<Project> getAllProjects() {
        return Arrays.asList(
            new Project(1L, "Project One", "Description of project one", "Java, Spring Boot", "http://linkto.projectone.com", "http://linkto.projectone.com/image.png")
        );
    }
}
