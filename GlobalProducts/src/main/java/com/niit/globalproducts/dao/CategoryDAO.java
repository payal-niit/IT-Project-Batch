package com.niit.globalproducts.dao;

import java.util.List;

import com.niit.globalproducts.model.Category;

public interface CategoryDAO {
	
	boolean addCategory(Category category);
	boolean updateCategory(Category category);
	boolean deleteCategory(int categoryId);
	
	List<Category> getCategoryList();
	Category getCategoryById(int categoryId);

}
