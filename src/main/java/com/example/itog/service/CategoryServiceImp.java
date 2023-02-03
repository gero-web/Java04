package com.example.itog.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itog.models.Category;
import com.example.itog.models.Tovar;
import com.example.itog.models.repository.CategoryRepository;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryRepository reppsitory;

    @Override
    public Category saveCategory(Category category) {
        return reppsitory.save(category);
    }

    @Override
    public List<Category> fetchCategoryList() {
        return (List<Category>) reppsitory.findAll();
    }

    @Override
    public Category updateCategory(Category category, Integer categoryId) {
        Category depDB = reppsitory.findById(categoryId)
                .get();

        if (Objects.nonNull(category.getName())
                && !"".equalsIgnoreCase(
                    category.getName())) {
            depDB.setName(category.getName());
        }

       

        if (Objects.nonNull(category.getTovar())) {
            depDB.setTovar(category.getTovar());
        }

        return reppsitory.save(depDB);
    }

    @Override
    public void deleteCategory(Integer categoryId) {
        reppsitory.deleteById(categoryId);
    }

    @Override
    public List<Tovar> fetchTovarList(String nameCategory) {
        
        return (List<Tovar>) reppsitory.findByCategoryName(nameCategory);
    }

   

}
