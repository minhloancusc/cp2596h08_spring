package com.mypack.controller;

import com.mypack.dao.CategoryDAO;
import com.mypack.entities.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author minhloan
 */
@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryDAO dao;

    @GetMapping("/edit")
    public String edit(@RequestParam("id") int id, Model model) {
        Categories c = dao.findById(id);
        if (c == null) {
            return "redirect:/categories/list";
        }
        model.addAttribute("category", c);
        model.addAttribute("list", dao.findAll());
        return "categories";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        dao.delete(id);
        return "redirect:/categories/list";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Categories category) {
        if (category.getCategoryID() == null || category.getCategoryID() == 0) {
            dao.insert(category);
        } else {
            dao.update(category);
        }
        return "redirect:/categories/list";
    }

    @GetMapping("/list")
    public String home(Model model) {
        model.addAttribute("list", dao.findAll());
        model.addAttribute("category", new Categories());
        return "categories";
    }

}
