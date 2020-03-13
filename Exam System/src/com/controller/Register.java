package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.RegisterDao;
import com.model.RegisterPojo;

/**
 * Servlet implementation class Register
 */
/**
 * @author giveu
 *
 */
@WebServlet("/com.controller.Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
		String firstName=request.getParameter("Fname");
		String lastName=request.getParameter("Lname");
	    String userName=request.getParameter("Uname");
	    String email=request.getParameter("Email");
		String gender=request.getParameter("Gender");
		String password=request.getParameter("Pass");
		String con_Password=request.getParameter("Con_Pass");
		
		RegisterPojo register=new RegisterPojo();
		register.setFirstName(firstName);
		register.setLastName(lastName);
		register.setUSerName(userName);
        register.setEmail(email);
        register.setGender(gender);
        register.setPassword(password);
        register.setCon_Password(con_Password);		
        
        int check=0;
        try {
			 check=RegisterDao.registerCustomer(register);
			 
			 if(check>0)
			 {
				 HttpSession session=request.getSession();
				 session.setAttribute("Email", email);
				 response.sendRedirect("home.jsp?Welcome To Home Page");
			 }
			 else
			 {
				 response.sendRedirect("index.jsp?Something Went Wrong");
			 }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
