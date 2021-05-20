package com.student.info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RetriveStud {
	static Connection con =null;
	static Statement stmt = null;
	static String url ="jdbc:mysql://localhost:3306/studentdatabase";
	static String usr ="root";
	static String pwd = "root";
	
	static void display(String scan) throws SQLException {
		String sql= "select * from studentinfo where sno ='"+scan+"'";
		try {
			con = DriverManager.getConnection(url,usr,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			String sn = rs.getString(1);
			String snm = rs.getString(2);
			String sub1 = rs.getString(3);
			String sub2	= rs.getString(4);
			System.out.println(sn+"|"+snm+"|"+sub1+"|"+sub2+"\n");
		}
		
	}
	public static void main(String[] args) throws SQLException {
		
		
		System.out.println("Enter the Student No You want the Information:");
		Scanner scan = new Scanner(System.in);
		String sc = scan.nextLine();
	
		RetriveStud.display(sc);		

	}

}
