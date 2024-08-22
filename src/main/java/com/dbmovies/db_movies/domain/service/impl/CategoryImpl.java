package com.dbmovies.db_movies.domain.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dbmovies.db_movies.domain.entities.Category;
import com.dbmovies.db_movies.domain.repositories.CategoryRepository;
import com.dbmovies.db_movies.domain.service.ICategory;

@Service
public class CategoryImpl implements ICategory {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return  categoryRepository.findAll(pageable);
    }

    @Override
    public Optional<Category> findOneById(Long Id) {
        return categoryRepository.findById(Id);
    }

    @Override
    public Category createOne(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateOneById(Long Id, Category category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOneById'");
    }

    @Override
    public Optional<Category> delete(Long Id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
