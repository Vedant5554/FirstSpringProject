package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "<b>Hello World!!!</b>";
    }

    @GetMapping("/")
    public String getHome(){
        return "Welcome Home";
    }

    @GetMapping("/test")
    public String getTest(){
        return "vedant... gavate";
    }
}
