package com.dgmf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// This is a simple Spring Boot controller that
// handles HTTP GET requests to the "/hello" endpoint and
// returns a "Hello World" message.
@RestController
public class HelloController {
    // The @GetMapping annotation maps HTTP GET requests to
    // the hello() method.
    @GetMapping("/hello")
    public String hello(){
        // The method returns a simple string message.
        return "Hello World";
    }

    // The @PostMapping annotation maps HTTP POST requests to
    // the helloPost() method.
    @PostMapping("/hello")
    public String helloPost(
            // The @RequestBody annotation indicates that the method
            // parameter should be bound to the body of the HTTP request.
            @RequestBody String name
    ){
        // The method returns a personalized greeting message.
        return "Hello " + name + "!";
    }
}
