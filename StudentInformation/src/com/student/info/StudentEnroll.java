package com.student.info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentEnroll {
	private int sno;
	private String sname;
	private String subject1;
	private String subject2;
	static Connection con =null;
	static Statement stmt = null;
static 	String Url="jdbc:mysql://localhost:3306/studentdatabase";
static 	String usr="root";
static 	String pwd ="root";	

public static void main(String[] args) throws SQLException,Exception {
	StudentEnroll stud = new StudentEnroll();
	System.out.println("Please select Operation 1: Display Record 2. Insert Record:");
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	switch(x) {
				case 1: System.out.println("You have Selected Display Record:");
						stud.displayStudInfo();
						break;
				case 2: System.out.println("You have Selected Insert Record:");
						Scanner scr = new Scanner(System.in);
							String sno = scr.next();
							String sname = scr.next();
							String subject1= scr.next();
							String subject2 =scr.next();
							if(sno!=null&&sname!=null&&subject1!=null&&subject2!=null)
							stud.insertStudInfo(sno,sname,subject1,subject2);
							else
							System.out.println("Valuse should not be null:");
						break;
				default:System.out.println("Please select valid Operation");
						scan.close();
						break;
	}
}

public void insertStudInfo(String sno,String sname, String subject1, String subject2) throws SQLException {
	String sn =sno;
	String sna=sname;
	String sub1= subject1;
	String sub2 = subject2;
	try{
		con=DriverManager.getConnection(Url,usr,pwd);
		if(con!=null) {
			stmt = con.createStatement();
			if(stmt!=null) {
				String sql="insert into studentdatabase.studentinfo values('"+sn+"','"+sna+"','"+sub1+"','"+sub2+"')";
				stmt.executeUpdate(sql);
				System.out.println("Inserted Sucessfully:");
			}
		}
		else {
			System.out.println("Connection Error in Statement:");
		}
	}
	catch(SQLException e2) {
		e2.printStackTrace();
	}
	finally {
		stmt.close();
		con.close();
	}
}
public void displayStudInfo() throws SQLException {
	try {
		con=DriverManager.getConnection(Url,usr,pwd);
		if(con!=null) {
			stmt = con.createStatement();
			if(stmt!=null) {
				String sql1="select sno,sname,subject1,subject2 from studentdatabase.studentinfo";
				ResultSet rs = stmt.executeQuery(sql1);
				System.out.println("SNO | SNAME | SUBJECT1 | SUBJECT2 \n");
				while(rs.next()) {
					System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4)+"\n");
				}
			}
		}else
		{
			System.out.println("Some Technical Error for Retriev Information:");
		}
	}
	catch(SQLException e1) {
		e1.printStackTrace();
	}
	finally {
		stmt=null;
		con=null;
		System.out.println("Server got Closed:");
	}
	
	
}
}
