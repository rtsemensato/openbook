package com.paschua.openbook.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @Value("${index.message}")
    private String indexMessage;

    @Value("${indexroot.message}")
    private String indexRootMessage;

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/")
    public String toIndex(Model model) {
        model.addAttribute("message", indexMessage);

        return "index";
    }

    @GetMapping("/index")
    public String toIndexRoot(Model model) {
        model.addAttribute("message", indexRootMessage);

        return "index";
    }

    @GetMapping("/welcome")
    public String toWelcome(Model model) {
        model.addAttribute("message", welcomeMessage);

        return "welcome";
    }
}
