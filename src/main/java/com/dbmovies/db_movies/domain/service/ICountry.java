package com.dbmovies.db_movies.domain.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dbmovies.db_movies.domain.entities.Country;

public interface ICountry {
    Page<Country> findAll(Pageable pageable);

    Optional<Country> findOneById(Long Id);

    Country createOne(Country country);

    Country updateOneById(Long Id, Country country);

    Optional<Country> delete(Long Id);
}
