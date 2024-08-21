package com.dbmovies.db_movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbmovies.db_movies.domain.entities.Address;

public interface AddressRepository extends JpaRepository <Address, Long> {

}
