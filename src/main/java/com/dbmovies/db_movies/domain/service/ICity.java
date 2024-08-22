package com.dbmovies.db_movies.domain.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dbmovies.db_movies.domain.entities.City;

public interface ICity {
    Page<City> findAll(Pageable pageable);

    Optional<City>  findById(Long id);

    City createOne(City city);

    City updateOneById(Long id, City city);

    Optional<City> delete(Long id);
}
