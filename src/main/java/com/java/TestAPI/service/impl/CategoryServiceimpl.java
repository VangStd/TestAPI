package com.java.TestAPI.service.impl;


import com.java.TestAPI.entity.Categories;
import com.java.TestAPI.repository.CategoryRepository;
import com.java.TestAPI.service.CategoryService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoryServiceimpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Categories> findAllCate() {
		return categoryRepository.findAll();
	}

	@Override
	public Categories findById(long id) {
		return categoryRepository.findById(id).get();
	}

}
