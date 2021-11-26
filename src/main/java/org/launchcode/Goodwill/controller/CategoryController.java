package org.launchcode.Goodwill.controller;

import lombok.Data;
import org.launchcode.Goodwill.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/eventCategories")
public class CategoryController {
    private List<String>category = new ArrayList<>();

    @GetMapping
    public String displayAllCategories(Model model) {
        Category category = new Category();
        model.addAttribute("category",category);
        model.addAttribute("title", "Create Categories");
        return "categories/create";
    }

    @PostMapping("create")
    public String CreateCategoryEventForm(Model model,@ModelAttribute Category category) {
         model.addAttribute("title","create Category");
         System.out.println("category name is "+category.getCategoryName());
         System.out.println("category type is "+category.getCategoryType());
         //save to DB
         //Get all list from DB
        //Set to model attribute
        return "categories/category";
    }
}
