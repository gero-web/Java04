package com.example.itog.controllers;

import org.springframework.web.bind.annotation.RestController;


import com.example.itog.models.Category;
import com.example.itog.service.CategoryServiceImp;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryServiceImp rep;

    @PostMapping("/createCategory")
    public Category saveCategory(
            @Valid @RequestBody Category category) {
        return rep.saveCategory(category);
    }

    @GetMapping("/allCategory")
    public List<Category> getAllCategory() {
        return rep.fetchCategoryList();
    }

    @PutMapping("/updatesCategory/{id}")
    public Category updateDepartment(@RequestBody Category category,
            @PathVariable("id") Integer categoryId) {
        return rep.updateCategory(
            category, categoryId);
    }

    @DeleteMapping("/deleteCategory/{id}")
    public String deleteDepartmentById(@PathVariable("id") Integer id) {
        rep.deleteCategory(id);
        return "Deleted Successfully";
    }

}