package com.leandrocardoso.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/")
    public String index() {
        return "\n\nProjeto para o estudo mais detalhado do Java com SpringBoot...";
    }

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "\nHello world !!!\n";
    }
}
