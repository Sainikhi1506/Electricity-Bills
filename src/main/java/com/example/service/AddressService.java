package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AddressDao;
import com.example.model.Address;
import com.example.repository.AddressRepository;

@Service
public class AddressService implements AddressDao<Address, Integer>{
	
	@Autowired
	private AddressRepository addressRepository;
	
	public Address save(Address address) {
     
		address = addressRepository.save(address);
        return address;
    }

    @Override
    public List<Address> findAll() {
        List<Address> addresses = (List<Address>) addressRepository.findAll();
        return addresses;
    }

}
