package com.dbmovies.db_movies.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.dbmovies.db_movies.domain.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {

}
