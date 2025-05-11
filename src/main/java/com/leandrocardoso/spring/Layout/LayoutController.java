package com.leandrocardoso.spring.Layout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LayoutController {

    @GetMapping("/layout")
    public String layout() {
        return "layout";
    }

}
