package com.dbmovies.db_movies.domain.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dbmovies.db_movies.domain.entities.Country;
import com.dbmovies.db_movies.domain.repositories.CountryRepository;
import com.dbmovies.db_movies.domain.service.ICountry;

@Service
public class CountryImpl implements ICountry {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Page<Country> findAll(Pageable pageable) {
        return countryRepository.findAll(pageable);
    }

    @Override
    public Optional<Country> findOneById(Long Id) {
        return countryRepository.findById(Id);
    }

    @Override
    public Country createOne(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country updateOneById(Long Id, Country country) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOneById'");
    }

    @Override
    public Optional<Country> delete(Long Id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
