package com.springframework5.home.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingsInEnglish  implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello in English";
    }
}
