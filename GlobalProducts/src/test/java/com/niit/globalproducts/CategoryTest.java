package com.niit.globalproducts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.globalproducts.config.AppConfig;
import com.niit.globalproducts.model.Category;
import com.niit.globalproducts.service.CategoryService;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class)
public class CategoryTest {
	
	@Autowired
	CategoryService categoryService;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	categoryService=null;
	}
	@Test
	public void addCategoryTest() {
		Category category = new Category();
		category.setCategoryName("Electronics");
		category.setCategoryDesc("Electronics desc");
		
		assertTrue("Category Added",categoryService.addCategory(category));
	}

	

}
