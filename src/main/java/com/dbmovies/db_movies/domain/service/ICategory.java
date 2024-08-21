package com.dbmovies.db_movies.domain.service;

import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dbmovies.db_movies.domain.entities.Category;

public interface ICategory {
    Page<Category> findAll(Pageable pageable);

    Optional<Category> findOneById(Long Id);

    Category createOne(Category category);

    Category updateOneById(Long Id, Category category);

    Optional<Category> delete(Long Id);
}
