package com.mypack.spring_way3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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


}
