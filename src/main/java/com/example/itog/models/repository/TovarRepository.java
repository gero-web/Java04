package com.example.itog.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.itog.models.Tovar;

import java.util.List;

import com.example.itog.models.Category;

@Repository
public interface TovarRepository extends CrudRepository<Tovar, Integer> {
    List<Category> findByTovarName(String name);
}
