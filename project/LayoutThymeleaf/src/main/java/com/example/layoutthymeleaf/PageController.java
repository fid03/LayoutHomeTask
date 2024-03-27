package com.example.layoutthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {


    @GetMapping("/")
    public String home() {
        return "home"; // This will return the home.html template
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // This will return the about.html template
    }

}
