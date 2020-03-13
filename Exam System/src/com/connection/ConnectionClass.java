package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Sanjay Kumar Das
 *
 *Date-05/02/2020
 *
 *Connection Class Logic -This class is used to create connection
 *
 */
public class ConnectionClass {

	  public static Connection createConnection() throws ClassNotFoundException, SQLException
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_System", "root", "FeelDream");  
		return con;
		  
	  }
}
