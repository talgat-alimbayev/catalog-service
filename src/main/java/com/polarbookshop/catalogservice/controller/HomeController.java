package com.polarbookshop.catalogservice.controller;

import com.polarbookshop.catalogservice.config.PolarProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public HomeController(PolarProperties polarProperties) {
        this.polarProperties = polarProperties;
    }

    private final PolarProperties polarProperties;

    @GetMapping("/")
    private String getGreeting() {
        return polarProperties.getGreeting();
    }
}
