package com.example.articles.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/blog")
    public String blogMain(Model model) {
        model.addAttribute("title", "О нас");
        return "blog-main";
    }
}
