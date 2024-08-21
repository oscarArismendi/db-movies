package com.dbmovies.db_movies.domain.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbmovies.db_movies.domain.entities.Movie;
import com.dbmovies.db_movies.domain.service.IMovies;
import com.dbmovies.db_movies.repositories.MovieRepository;



@Service
public class MovieImpl implements IMovies {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Page<Movie> findAll(Pageable pageable) {
        return movieRepository.findAll(pageable);    
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Movie> findOneById(Long Id) {
        return movieRepository.findById(Id);
    }

    @Override
    public Movie createOne(Movie movie) {
       return movieRepository.save(movie);
    }

    @Override
    public Movie updateOneById(Long Id, Movie movie) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOneById'");
    }

    @Override
    public Optional<Movie> delete(Long Id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }   

}
