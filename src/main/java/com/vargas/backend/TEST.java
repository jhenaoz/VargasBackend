package com.vargas.backend;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vargas.backend.dao.CategoryRepository;
import com.vargas.backend.entity.Categoria;

@Component
public class TEST {

	@Autowired
	private CategoryRepository repository;
	
	@PostConstruct
	public void doMagic(){
		Categoria cat = new Categoria();
		cat.setName("Animales");
//		Guardamos en base de datos
		repository.save(cat);		
	}
	
}
