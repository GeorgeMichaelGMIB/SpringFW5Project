package com.springframework5.home.controller;


import com.springframework5.home.repositories.PublisherRepository;
import org.springframework.stereotype.Controller;

@Controller
public class PublisherController {

    private PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }
}
