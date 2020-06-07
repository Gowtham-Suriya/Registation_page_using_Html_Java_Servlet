package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.student.Student;

public class StudentDAO {
  public int insertData(Student s)
  {    int rs=0;
	  try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("hello");
	        Connection con;
			
				con = DriverManager.getConnection(  
				                "jdbc:mysql://localhost:3306/gowtham","root","root");
			
	        PreparedStatement st=con.prepareStatement("insert into registation values(default,?,?,?,?,?)");  
	        st.setString(1,s.getUname());
	        st.setString(2,s.getEmail());
	        st.setString(3, s.getDob());
	        st.setString(4,s.getCountr());
	        st.setString(5,s.getPassword());
	        

	        rs=st.executeUpdate();
	        
	        System.out.println(rs);

	        con.close();
	  }
	  catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return rs;
	  
  }

}
