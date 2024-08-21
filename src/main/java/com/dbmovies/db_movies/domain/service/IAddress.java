package com.dbmovies.db_movies.domain.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dbmovies.db_movies.domain.entities.Address;

public interface IAddress {
    Page<Address> findAll(Pageable  pageable);

    Optional<Address> findOneById(Long Id);

    Address createOne(Address address);

    Address updateOneById(Long Id,Address address);

    Optional<Address> delete(Long Id);
}
