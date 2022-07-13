package com.example.dao;

import com.example.model.Customer;

import java.sql.SQLException;
import java.util.List;



public interface CustomerDao<T, ID> {
	List<T> findAll();

	T save(T t);
}
