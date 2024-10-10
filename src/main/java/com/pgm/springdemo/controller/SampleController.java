package com.pgm.springdemo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public String hello(){
        log.info("hello");
        return "hello";  // /WEB-INF/views/hello.jsp
    }
}
