package com.example.dao;

import java.util.List;

public interface ConnectionDao<T, ID> {
	
	List<T> findAll();

	T save(T t);

}
