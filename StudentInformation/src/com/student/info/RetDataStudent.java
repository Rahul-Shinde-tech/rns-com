package com.student.info;

import java.sql.*;

public class RetDataStudent {

	public static void main(String[] args)throws SQLException {
		Connection con = null;
		Statement stmt = null;
		String url= "jdbc:mysql://localhost:3306/studentdatabase";
		String usr ="root";
		String pwd="root";
		
		try {
			con=DriverManager.getConnection(url,usr,pwd);
			stmt= con.createStatement();
			String query="select sid,sname from student";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
