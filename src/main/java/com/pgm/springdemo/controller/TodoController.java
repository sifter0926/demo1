package com.pgm.springdemo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo")
public class TodoController {

    //locolhost:8080/todo/list
    //@RequestMapping(value = "/list", method = RequestMethod.GET)
    @GetMapping("/list")
    public void list() {
        log.info("list");
    }
    //@RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public void registerGet() {
        log.info("registerGet");
    }
    //@RequestMapping(value = "/register", method = RequestMethod.POST)
    @PostMapping("/register")
    public String registerPost() {
        log.info("registerPost");
        return "/todo/list";
    }
}
