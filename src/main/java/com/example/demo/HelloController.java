package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.SpirosService;

@RestController
public class HelloController {

    @Autowired
    private SpirosService spirosService;

    @GetMapping("/hello")
    public String hello() {
        spirosService.logHelloCall();
        return "Hello, World!";
    }
}
