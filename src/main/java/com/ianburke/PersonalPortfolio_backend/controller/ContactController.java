package com.ianburke.PersonalPortfolio_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ianburke.PersonalPortfolio_backend.model.Contact;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
    @PostMapping
    public String handleContact(@RequestBody Contact contact) {

        return "Thank you for your message, " + contact.getName() + "! I'll get back to you soon.";
    }
}
