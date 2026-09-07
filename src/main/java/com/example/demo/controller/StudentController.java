package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("StudentController")
public class StudentController {

    @GetMapping("/")
    public String home() {
        return "Demo application is running. Open /api/status to check the server.";
    }
}