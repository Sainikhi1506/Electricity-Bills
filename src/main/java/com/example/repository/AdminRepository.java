package com.example.repository;

import com.example.model.Customer;
import com.example.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Customer, Integer> {

    User findByEmail(String email);

    Customer findByUsernameAndPassword(String userName, String password);
}