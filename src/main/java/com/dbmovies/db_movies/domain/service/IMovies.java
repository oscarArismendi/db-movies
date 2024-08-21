package com.dbmovies.db_movies.domain.service;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dbmovies.db_movies.domain.entities.Movie;

public interface IMovies {
    Page<Movie> findAll(Pageable  pageable);

    Optional<Movie> findOneById(Long Id);

    Movie createOne(Movie movie);

    Movie updateOneById(Long Id,Movie movie);

    Optional<Movie> delete(Long Id);

}
