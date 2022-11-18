package com.java.TestAPI.repository;


import com.java.TestAPI.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryRepository extends JpaRepository<Categories, Long>{

}
