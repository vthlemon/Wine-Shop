package com.wineshop.service;

import java.util.List;

import com.wineshop.entity.Category;

public interface CategoryService {

	List<Category> getAllCategory();
	boolean insertCategory(Category category);
	boolean updateCategory(Category category);
	boolean removeCategory(int id);
}
