package com.niit.ecommerceapp.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.niit.ecommerceapp.model.Category;
import com.niit.ecommerceapp.repository.CategoryRepository;

public class CategoryTest {
	
	Category category;
	
	CategoryRepository categoryRepository;

	@Before
	public void setUp() throws Exception {
		
		category = new Category();
		categoryRepository = new CategoryRepository();
	}

	@After
	public void tearDown() throws Exception {
		
		category= null;
	}
	
	@Test
	public void addCategoryTest() {
		category.setCategory_id(1);
		category.setCategory_name("Mobiles");
		category.setCategory_desc("Mobiles Desc");
		
		
		categoryRepository.addCategory(category);
		assertEquals("The category id generated is 1",1, category.getCategory_id());
	}



}
