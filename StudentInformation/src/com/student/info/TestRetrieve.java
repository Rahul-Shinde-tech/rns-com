package com.student.info;
import java.sql.*;
import java.util.Scanner;

public class TestRetrieve {

	public static void main(String[] args) throws Exception {
		Connection con= null;
		Statement stmt = null;
		final String url="jdbc:MySQL://localhost:3306?user=root&password=root";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Sno :");
		String so= scan.nextLine();
		scan.close();
		String qry = "Select sno, sname, subject, subject2 from studentinfo.studentinfo where sno ='"+so+"'";
		try {
			//class.forName("com.jdbc.mysql.Driver");
			con = DriverManager.getConnection(url);
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			System.out.println("SNO\t  | Sname\t | Subject1\t | Subject2\t \n");
			while(rs.next()) {
				String sn = rs.getString(1);
				String sname = rs.getString("sname");
				String subject1 = rs.getString("subject1");
				String subject2 = rs.getString("subject2");
				System.out.println(sn+"\t"+sname+"\t"+subject1+"\t"+subject2);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
				if(con!=null) {
					con.close();
				}
			}
			catch(SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
