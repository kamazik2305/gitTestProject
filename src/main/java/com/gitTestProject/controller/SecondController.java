package com.gitTestProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @GetMapping("/adress")
    public String getString()
    {
        return "string";
    }

}
