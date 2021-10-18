package com.springframework5.home.controller;

import com.springframework5.home.service.GreetingService;
import com.springframework5.home.service.GreetingsInEnglish;
import com.springframework5.home.service.GreetingsInRussian;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingsInEnglish greetingsInEnglish;
    private final GreetingsInRussian greetingsInRussian;
    //to use qualifiers to solve found two candidate(Qualifiers) beans for a specific bean which is the greetingService.
    private final GreetingService greetingService;

    public MyController(GreetingsInEnglish greetingsInEnglish, GreetingsInRussian greetingsInRussian,@Qualifier("greetingsInEnglish") GreetingService greetingService) {
        this.greetingsInEnglish = greetingsInEnglish;
        this.greetingsInRussian = greetingsInRussian;
        this.greetingService = greetingService;
    }

    public void sayHello() {
       System.out.println( this.greetingsInEnglish.sayGreeting());
       System.out.println(this.greetingsInRussian.sayGreeting());
    }

}
