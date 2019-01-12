package com.niit.ecommerceapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.niit.ecommerceapp.config.DBConfig;
import com.niit.ecommerceapp.model.Category;

public class CategoryRepository {
	
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	Connection connection;
	
	public CategoryRepository() {
		connection=DBConfig.getConnection();
	}
	
	public void addCategory(Category category) {
		String sql = "insert into Category (category_id, category_name, category_desc) values (?,?,?)";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, category.getCategory_id());
			preparedStatement.setString(2, category.getCategory_name());
			preparedStatement.setString(3, category.getCategory_desc());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
