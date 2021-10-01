package com.springframework5.home.controller;

import com.springframework5.home.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}
