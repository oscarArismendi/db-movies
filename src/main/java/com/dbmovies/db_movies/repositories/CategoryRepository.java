package com.dbmovies.db_movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbmovies.db_movies.domain.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
