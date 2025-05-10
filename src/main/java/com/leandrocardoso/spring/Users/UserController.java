package com.leandrocardoso.spring.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/")
    public String index() {
        return "<h1>Projeto para o estudo mais detalhado do Java com SpringBoot...</h1>";
    }

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "<h1>Hello world !!!</h1>";
    }

}
