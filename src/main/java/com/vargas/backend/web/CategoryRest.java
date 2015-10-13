package com.vargas.backend.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vargas.backend.dao.CategoryRepository;
import com.vargas.backend.entity.Categoria;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryRest {
	
	@Autowired
	private CategoryRepository category;
	
	@RequestMapping(
			value = "/api/categories",
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
	public List<Categoria> listCategories() {
	    
		ArrayList<Categoria> categorias = new ArrayList<>();
		for (Categoria item : category.findAll()) {
	        categorias.add(item);
	    }
		return categorias;
		
	}
	
	@RequestMapping(
			value = "/api/vargas",
			produces = MediaType.TEXT_PLAIN_VALUE,
			method = RequestMethod.POST)
	public String get() {
		return "Hola Vargas";
	}

}
