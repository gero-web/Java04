package com.example.itog.service;

import java.util.List;

import com.example.itog.models.Category;
import com.example.itog.models.Tovar;

public interface CategoryService {
    // Save operation
    Category saveCategory(Category category);

    // Read operation
    List<Category> fetchCategoryList();

    
    List<Tovar> fetchTovarList(String nameCategory);

    // Update operation
    Category updateCategory(Category category,
            Integer categoryId);

    // Delete operation
    void deleteCategory(Integer categoryId);
}
