package com.niit.ecommerceapp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {	
	
	public static Connection getConnection () {
		Connection connection = null;
		try {			
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/IT-Projectbatch", "sa", "");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}		
		return connection;		
	}

}
