package com.gitTestProject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @PostMapping("/main")
    public String main()
    {
        return  "main";
    }

    @DeleteMapping("/main")
    public String delete()
    {
        return "delete";
    }

    @GetMapping("/main")
    public String get()
    {
        return "get";
    }

    @PutMapping("/main")
    public String puy()
    {
        return "put";
    }
}
