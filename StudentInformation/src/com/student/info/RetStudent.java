package com.student.info;
import java.sql.*;

public class RetStudent {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		String url ="jdbc:mysql://localhost:3306/studentdatabase";
		String usr = "root";
		String pwd = "root";
		try {
			con= DriverManager.getConnection(url,usr,pwd);
			if(con!=null) {
				System.out.println("Server Connection Established:");
				stmt = con.createStatement();
				if(stmt!=null) {
					String qry="Select Sno,sname,subject1,subject2 from Studentinfo";
					System.out.println("Statement Created...");
					ResultSet rs = stmt.executeQuery(qry);
					System.out.println("SNO | SNAME   | SUBJECT1  | SUBJECT2 \n");
					while(rs.next()) {
						System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" \n ");
					}
				}
				else
				{
					System.out.println("Statement Creation Failed...");
					stmt=null;
				}
			}
			else
			{
				System.out.println("Server Connection failed...");
				con=null;
			}
		}
		catch(SQLException e1) {
			System.out.println("Need to Handle Issue...");
			e1.printStackTrace();
		}
		finally {
			System.out.println("Server went for Rest...");
			stmt=null;
			con= null;
		}
		

	}

}
