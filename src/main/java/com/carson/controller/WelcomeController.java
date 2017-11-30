package com.carson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Carson
 */
@Controller
public class WelcomeController {

    @GetMapping(value = "/")
    public String welcome() {
        return "index";
    }
}
