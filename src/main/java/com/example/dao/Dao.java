package com.example.dao;

import java.util.List;

public interface Dao<T, ID> {
    List<T> findAll();

    T save(T t);
}
