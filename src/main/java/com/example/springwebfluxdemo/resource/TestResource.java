package com.example.springwebfluxdemo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {

    @GetMapping("/name")
    public String myName(){
        return "Virendra Yadav 1";
    }
}
