package com.example.sample.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestClass {
    @GetMapping("/test")
    public String testMethod(){
        return "sss";
    }

    @GetMapping("/test1")
    public String testMethod1(){
        return "21414512412";
    }
}
