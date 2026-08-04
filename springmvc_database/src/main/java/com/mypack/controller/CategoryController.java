package com.mypack.controller;

import com.mypack.dao.CategoryDAO;
import com.mypack.entities.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author minhloan
 */
@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryDAO dao;

    @GetMapping("/list")
    public String home(Model model) {
        model.addAttribute("list", dao.findAll());
        model.addAttribute("category", new Categories());
        return "categories";
    }

}
