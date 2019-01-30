package com.niit.globalproducts.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.globalproducts.model.Category;
//this is where business logic
@Repository
public class CategoryDAOImpl implements CategoryDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public boolean addCategory(Category category) {
		sessionFactory.getCurrentSession().save(category);
		return true;
	}

	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Category getCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
