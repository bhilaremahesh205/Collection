package com.mahesh.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcdemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
		Statement stmt=con.createStatement();
		String sql="select * from student";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			rs.getString(1);
			int id=rs.getInt("Sid");
			String name=rs.getString("Sname");
			String address=rs.getString("Saddress");
			String dept=rs.getString("Sdept");
			String collge=rs.getString("Scollege");
			System.out.println(id);
			System.out.println(name);
			System.out.println(address);
			System.out.println(dept);
			System.out.println(collge);
			stmt.close();
			con.close();
			
		}
	}

}



