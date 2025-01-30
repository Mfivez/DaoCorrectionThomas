package com.example.jdbci.repositories;

import java.util.List;

interface BaseRepo<T> {
    List<T> getAll();
    T getOne(int id);
    boolean insert(T entity);
    boolean update(int id, T entity);
    boolean delete(int id);
}
