package com.gitTestProject.controller;

import com.gitTestProject.service.MainService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    private MainService service;

    //fixme
    @PostMapping("/main")
    public String main() {
        return "main";
    }

    //todo modify that
    @DeleteMapping("/main")
    public String delete() {
        return "delete";
    }

    @GetMapping("/main")
    public String get() {
        return "get";
    }

    @PutMapping("/main")
    public String puy() {
        return "put";
    }

    @GetMapping("/service")
    public String returnServiceStr()
    {
        return service.returnStr();
    }
}
