package com.niit.globalproducts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.globalproducts.dao.CategoryDAO;
import com.niit.globalproducts.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDAO categoryDAO;
	
	public boolean addCategory(Category category) {
		categoryDAO.addCategory(category);
		return true;
	}
	
	

}
