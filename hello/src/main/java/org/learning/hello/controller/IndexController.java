package org.learning.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping("/")
    public String homepage() {
        return "homepage";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/terms-and-conditions")
    public String termsAndConditions() {
        return "terms-and-conditions";
    }
}
