package com.student.info;
import java.util.Scanner;
import java.sql.*;

public class StudentInfo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		
		final String Url ="jdbc:mysql://localhost:3306/studentdatabase";
		String username = "root";
		String password = "root";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Student Sno:");
		String sn= scan.next();
		scan.close();
		String qry="Select sno, sname, subject1, subject2 from studentinfo where sno ='"+sn+"'";
		try {
			con = DriverManager.getConnection(Url,username,password);
			if(con!=null) {
				System.out.println("Connected to the Server:");
			}else
			{
				System.out.println("Need to establish Connection:");
			}
			stmt= con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			System.out.println("SNO\t  | Sname\t | Subject1\t | Subject2\t \n");
			while(rs.next()) {
				String s1 = rs.getString(1);
				String sname = rs.getString("sname");
				String subject1 = rs.getString("subject1");
				String subject2 = rs.getString("subject2");
				System.out.println(s1+"\t"+sname+"\t"+subject1+"\t"+subject2);
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			
		}
		

	}

}
