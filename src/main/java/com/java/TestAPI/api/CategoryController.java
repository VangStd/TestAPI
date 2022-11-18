package com.java.TestAPI.api;


import com.java.TestAPI.entity.Categories;
import com.java.TestAPI.service.CategoryService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/api/category/")
	public ResponseEntity<List<Categories>> getAllCategory() {
		return new ResponseEntity<List<Categories>>(categoryService.findAllCate(), HttpStatus.OK);
	}

	@GetMapping("/api/content/")
	public ResponseEntity<String> getContent() {
		return new ResponseEntity<String>("Co", HttpStatus.OK);
	}
}
