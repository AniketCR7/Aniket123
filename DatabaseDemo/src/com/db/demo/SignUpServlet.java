package com.db.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addDetails")
public class SignUpServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		String firstName=request.getParameter("fname");
		String lastName=request.getParameter("lname");
		String emailId=request.getParameter("email");
		String passwd=request.getParameter("pass");
		
		
		try 
		{
			
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/records", "root", "root");
			PreparedStatement ps=con.prepareStatement("insert into data values(?,?,?,?)");
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, emailId);
			ps.setString(4, passwd);
			
	        ps.executeUpdate();


		//PrintWriter out=response.getWriter();
			
			//HttpSession session=request.getSession();
			//session.setAttribute("label",firstName);
			
			//response.sendRedirect("SignIn.jsp");
		//PrintWriter out=response.getWriter();
		//out.println("Welcome " +firstName);
	        
	        HttpSession session=request.getSession();
	        session.setAttribute("label", firstName);
	        
		response.sendRedirect("NewFile.jsp");
		//rd.forward(request, response);
		
			
			
			
		} 
		catch (Exception e)
		{
		System.out.println(e.getMessage());
		}
		
		
		
			 
	}

}
