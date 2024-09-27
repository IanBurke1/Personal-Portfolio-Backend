package com.ianburke.PersonalPortfolio_backend.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ianburke.PersonalPortfolio_backend.model.BlogEntry;
import com.ianburke.PersonalPortfolio_backend.repository.BlogEntryRepository;

@RestController
@RequestMapping("/api/blogs")
public class BlogEntryController {
	
	@Autowired
	private BlogEntryRepository blogEntryRepository;
	
	// Create a new Blog entry
	@PostMapping
	public BlogEntry createBlogEntry(@RequestBody BlogEntry blogEntry) {
        blogEntry.setCreatedAt(LocalDateTime.now());
        return blogEntryRepository.save(blogEntry);
    }

	// Fetch all blog entries
    @GetMapping
    public List<BlogEntry> getAllBlogEntries() {
        return blogEntryRepository.findAll();
    }
}
