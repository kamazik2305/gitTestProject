package com.gitTestProject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping
    public String main()
    {
        return  "main";
    }

    @DeleteMapping
    public String delete()
    {
        return "delete";
    }
}
