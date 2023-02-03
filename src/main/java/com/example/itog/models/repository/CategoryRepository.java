package com.example.itog.models.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.itog.models.Category;
import com.example.itog.models.Tovar;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    List<Tovar> findByCategoryName(String name);
}
