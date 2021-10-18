package com.springframework5.home.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingsInRussian implements GreetingService{

    @Override
    public String sayGreeting() {
        return "привет";
    }
}
