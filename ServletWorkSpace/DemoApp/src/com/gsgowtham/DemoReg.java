package com.gsgowtham;

import java.io.IOException;
import java.sql.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAO;
import com.student.Student;

@SuppressWarnings("serial")
public class DemoReg extends HttpServlet 
{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname=req.getParameter("username");
		String email=req.getParameter("email");
		String dob=req.getParameter("dob");
		String country=req.getParameter("country");
		String password=req.getParameter("password_1");
		Student s=new Student();
		s.setUname(uname);
		s.setEmail(email);
		s.setDob(dob);
		s.setCountr(country);
		s.setPassword(password);
		StudentDAO sdao=new StudentDAO();
	     int r=sdao.insertData(s);	

        
       if(r==1)
        
        res.getWriter().println("sucessfully Registered");
		 
       else
		res.getWriter().println("NOT Registered");
	
		
		
	}

}
