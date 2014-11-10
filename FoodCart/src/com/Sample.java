package com;

import java.sql.*;


public class Sample {
	
	public void run(){
		System.out.println("Hi");
	}
	

	public static void main(String[] arg)
	{
		System.out.println("Hi");
		Long id;
		String name;
		String dbUrl = "jdbc:mysql://localhost:3306/foodcartdb";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = "Select * FROM sampletable";

		try {

		Class.forName(dbClass);
		Connection con = DriverManager.getConnection (dbUrl,"root","root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
		id = rs.getLong(1);	
		name = rs.getString(2);
		System.out.println("Id "+ id + " Name " + name);
		} //end while

		con.close();
		} //end try

		catch(ClassNotFoundException e) {
		e.printStackTrace();
		}

		catch(SQLException e) {
		e.printStackTrace();
		}
	}
}
