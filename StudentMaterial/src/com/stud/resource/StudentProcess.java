package com.stud.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentProcess {
	private static Connection con= null;
	private static Statement stmt = null;
	private static PreparedStatement pstmt = null;
	private static String url="jdbc:mysql://localhost:3306/studentinfo";
	private static String usr = "root";
	private static String pwd ="root";
	private static int update=0;
	//established connnection
	static Connection getConnection(){
		try {
			con = DriverManager.getConnection(url,usr,pwd);
			System.out.println("Connection established...!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static void display() {
		try {
			String sql="Select * from studentinfo.studentsub";
			stmt = getConnection().createStatement();
			ResultSet rs= stmt.executeQuery(sql);
			System.out.println("SID || FIRSTNAME || LASTNAME || SUBJECT1 || SUBJECT2 \n");
			while(rs.next()) {
				System.out.println(rs.getInt("sid")+" || "+rs.getString("firstname")+" || "+rs.getString("lastname")+" || "+rs.getInt("subject1")+" || "+rs.getInt("subject"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			con=null;
			stmt=null;
			pstmt=null;
		}
	}
	
	public static void saveStudent(Student s){
		try {
			String sql="insert into studentinfo.studentsub(sid,firstname,lastname,subject1,subject) values(?,?,?,?,?) ";
			pstmt = getConnection().prepareStatement(sql);
			System.out.println("Statement Established:");
			pstmt.setInt(1, s.getSid());
			pstmt.setString(2, s.getfName());
			pstmt.setString(3, s.getlName());
			pstmt.setInt(4, s.getSubject1());
			pstmt.setInt(5, s.getSubject2());
			pstmt.executeUpdate();
			System.out.println("Record Inserted Successfull:");
			display();
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void deleteStudent(int sid) {
		String sql = "delete from studentinfo.studentsub where sid = ?";
		try {
			pstmt= getConnection().prepareStatement(sql);
			pstmt.setInt(1, sid);
			update = pstmt.executeUpdate();
			display();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void updateStudent(int sid, Student std) {
		String sql="update studentinfo.studentsub set firstname=?, lastname=?,subject1=?,subject=? where sid=?";
		try {
			pstmt=getConnection().prepareStatement(sql);
			pstmt.setInt(5, sid);
			pstmt.setString(1, std.getfName());
			pstmt.setString(2, std.getlName());
			pstmt.setInt(3, std.getSubject1());
			pstmt.setInt(4, std.getSubject2());
			pstmt.executeUpdate();
			System.out.println("Updated Sucessful..");
			display();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
