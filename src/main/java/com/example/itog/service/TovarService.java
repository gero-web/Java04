package com.example.itog.service;

import java.util.List;

import com.example.itog.models.Tovar;
import com.example.itog.models.Category;

public interface TovarService {
    // Save operation
    Tovar saveTovar(Tovar tovar);

    // Read operation
    List<Tovar> fetchTovarList();

    List<Category> fetchCategoryList(String nameTovar);

    // Update operation
    Tovar updateTovar(Tovar tovar,
            Integer tovarId);

    // Delete operation
    void deleteTovar(Integer tovarId);
}
