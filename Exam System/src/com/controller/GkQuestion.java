package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.GkQuestionDao;
import com.model.GkQuestionPojo;

/**
 * Servlet implementation class GkQuestion
 */
/**
 * @author giveu
 *
 */
@WebServlet("/com.controller.GkQuestion")
public class GkQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 String serialNo=request.getParameter("Sl");
		 String question=request.getParameter("Question");
		 String option1=request.getParameter("1");
		 String option2=request.getParameter("2");
		 String option3=request.getParameter("3");
		 String option4=request.getParameter("4");
		 String answer=request.getParameter("Answer");
		 
		 GkQuestionPojo add2=new GkQuestionPojo();
		 add2.setSerialNo(serialNo);
		 add2.setQuestion(question);
		 add2.setOption1(option1);
		 add2.setOption2(option2);
		 add2.setOption3(option3);
		 add2.setOption4(option4);
		 add2.setAnswer(answer);
		 
		 int check=0;
		 try {
		     check=GkQuestionDao.createQuestion(add2);
			if(check>0)
			{
				response.sendRedirect("Admin/admin.jsp?Question Added Succesfully");
			}
			else
			{
				response.sendRedirect("Admin/Question.jsp?Sorry Question Not Added ");
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
