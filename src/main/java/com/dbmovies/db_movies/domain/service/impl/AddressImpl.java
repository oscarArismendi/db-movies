package com.dbmovies.db_movies.domain.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dbmovies.db_movies.domain.entities.Address;
import com.dbmovies.db_movies.domain.repositories.AddressRepository;
import com.dbmovies.db_movies.domain.service.IAddress;

@Service
public class AddressImpl implements IAddress {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Page<Address> findAll(Pageable pageable) {
        return addressRepository.findAll(pageable);
    }

    @Override
    public Optional<Address> findOneById(Long Id) {
        return addressRepository.findById(Id);
    }

    @Override
    public Address createOne(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address updateOneById(Long Id, Address address) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOneById'");
    }

    @Override
    public Optional<Address> delete(Long Id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
