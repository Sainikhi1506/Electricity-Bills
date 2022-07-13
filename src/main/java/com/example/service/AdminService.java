package com.example.service;

import com.example.dao.Dao;
import com.example.dao.CustomerDao;
import com.example.model.Customer;
import com.example.model.Role;
import com.example.model.User;
import com.example.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminService implements CustomerDao<Customer, Integer> {
    @Autowired
   private AdminRepository adminRepository; 

    
    @Override
    public Customer save(Customer customer) {
        
    	customer = adminRepository.save(customer);
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = (List<Customer>) adminRepository.findAll();
        return customers;
    }
    public Customer checkUserNamePassword(String userName,String password){
        Customer customer=adminRepository.findByUsernameAndPassword(userName,password);
        return customer;
    }

  
}
