package com.telusko.springbootgradleapp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeluskoController {

    @GetMapping("/")
    public String getInto(){
        return "Gradle Telusko App";
    }
}
