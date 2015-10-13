package com.vargas.backend.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vargas.backend.entity.Categoria;

public interface CategoryRepository extends CrudRepository<Categoria, Integer> {

    List<Categoria> findByName(String lastName);
}
