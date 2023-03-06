package com.gitTestProject.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public String get()
    {
        return "get";
    }

    @PutMapping
    public String puy()
    {
        return "put";
    }
}
