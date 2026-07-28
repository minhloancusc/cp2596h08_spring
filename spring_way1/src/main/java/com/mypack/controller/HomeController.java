package com.mypack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author minhloan
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }
    @PostMapping("/submit")
    public String handleForm(@RequestParam("name") String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "result";
    }


}
