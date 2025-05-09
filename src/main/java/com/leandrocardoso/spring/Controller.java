package com.leandrocardoso.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "\nHello world !!!\n";
    }
}
