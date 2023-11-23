package com.example.springsecuritywithldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home")
    public String home() {
        return "<h1>HOME</h1>";
    }

}
