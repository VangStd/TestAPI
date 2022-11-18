package com.java.TestAPI.service;

import com.java.TestAPI.entity.Categories;
import java.util.List;

public interface CategoryService {

    List<Categories> findAllCate();

    Categories findById(long id);
}
