package com.example.demo.service;

import com.example.demo.model.City;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {

    List<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);
}
