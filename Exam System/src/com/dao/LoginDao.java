package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.ConnectionClass;
import com.model.LoginPojo;

/**
 * @author giveu
 *
 */
public class LoginDao {
        
	     public static int loginAdmin(LoginPojo login) throws ClassNotFoundException, SQLException
	     {
	    	 int status=0;
	    	 Connection con=ConnectionClass.createConnection();
	    	 String qry="select *from Admin where Email=? and password=?";
	    	 PreparedStatement pst=con.prepareStatement(qry);
	    	 pst.setString(1, login.getEmail());
	    	 pst.setString(2, login.getPassWord());
	    	 
	    	 ResultSet rs=pst.executeQuery();
				if (rs.next()) 
				{
					status=1;
				}
		     return status;	 
	     }
}
