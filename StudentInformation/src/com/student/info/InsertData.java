package com.student.info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class InsertData {
	
	public static void main(String[] args)  {
		Connection con =null;
		Statement stmt = null;
		String url = "jdbc:mysql://localhost:3306/studentdatabase";
		String userid ="root";
		String password ="root";
		try {
			con = DriverManager.getConnection(url,userid, password);
			stmt = con.createStatement();
			if(con!=null) {
				if(stmt!=null) {
					System.out.println("Enter the Student details: SNO SNAME");
					Scanner scan = new Scanner(System.in);
					int no = scan.nextInt();
					String name = scan.next();
					String qry = "insert into studentdatabase.student values('"+no+"','"+name+"')";
					stmt.executeUpdate(qry);
					System.out.println("Data Save Successfully:");
				}else {
					System.out.println("Statement is null");
				}
			}
			else {
				System.out.println(" Connection is null");
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			
		}
	}

}
