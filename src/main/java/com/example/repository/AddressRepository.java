package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Address;

public interface AddressRepository extends CrudRepository<Address, Integer>{

	
}
