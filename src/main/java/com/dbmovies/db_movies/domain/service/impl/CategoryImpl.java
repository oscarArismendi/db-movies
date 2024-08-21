package com.dbmovies.db_movies.domain.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dbmovies.db_movies.domain.entities.Category;
import com.dbmovies.db_movies.domain.service.ICategory;
import com.dbmovies.db_movies.repositories.CategoryRepository;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOneById'");
    }

    @Override
    public Category createOne(Category category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createOne'");
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
