package com.student.info;
import java.sql.*;

public class RetStudInfo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		String Url = "jdbc:mysql://localhost:3306/studentdatabase";
		String username ="root";
		String pass= "root";
		
		
		//stmt = con.createStatement();
		try {
			con=DriverManager.getConnection(Url,username,pass);
			if(con!=null) {
				System.out.println("Server Connection Established:");
				String qry = "Select Sno,sname,subject1,subject2 from studentinfo";
				stmt = con.createStatement();
				if(stmt!=null) {
					System.out.println("Statement created:");
					ResultSet rs = stmt.executeQuery(qry);
					System.out.println("SNO\tSNAME\tSUBJECT1\tsubject2\t\n");
					while(rs.next()) {
						System.out.println(rs.getString("sno")+"\t"+rs.getString("sname")+"\t"+rs.getString("subject1")+"\t"+rs.getString("subject2")+"\n");
						
						
					}
				}else
				{
					System.out.println("Statement Not Created:");
					stmt=null;
				}
			}
			else
			{
				System.out.println("Server Connection Fails:");
				con=null;
			}
			
		}
		catch(SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			stmt =null;
			con=null;
			
		}		
	}
}
