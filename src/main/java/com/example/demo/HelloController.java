package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    TodoRepository todoRepository;
    @GetMapping("/hello")
    public String getHello(){
        return "<b>Hello World!!!</b>";
    }

    @GetMapping("/")
    public String getHome(){
        List<Todo> todos = todoRepository.findAll();
        return "Welcome Home";
    }

    @GetMapping("/test")
    public String getTest(){
        return "vedant... gavate";
    }
}
