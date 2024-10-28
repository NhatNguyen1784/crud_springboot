package vn.hcmute.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.hcmute.entity.Category;
import vn.hcmute.service.impl.CategoryServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping
    public String getAll(ModelMap modelMap){
        List<Category> list = categoryService.findAll();
        System.out.println(list.size());
        modelMap.addAttribute("list", list);
        return "CRUD/category-list";
    }

//    @GetMapping("/signup")
//    public String signup(Category category, ModelMap modelMap){
//        modelMap.addAttribute("category", category);
//        return "CRUD/category-add";
//    }
}
