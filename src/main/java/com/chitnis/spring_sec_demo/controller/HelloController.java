package com.chitnis.spring_sec_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String great(HttpServletRequest request) {
        return "Hello Worlddddd!!" ;
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "Chitnis" + request.getSession().getId();
    }
}
