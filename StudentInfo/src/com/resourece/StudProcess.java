package com.resourece;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudProcess {
	static Connection con = null;
	static Statement stmt = null;
	static String url = "jdbc:mysql://localhost:3306/studentinfo";
	static String usr = "root";
	static String pwd = "root";
	Student std;
	StudProcess st;

	public static StudProcess getProInstance() {
		return new StudProcess();
	}

	public Connection getConnection() {
		try {
			con = DriverManager.getConnection(url, usr, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public void saveStudent(Student s) {
		Student std = s;
		st = getProInstance();
		int insertRow = 0;
		try {
			stmt = st.getConnection().createStatement();
			PreparedStatement stmt;
			try {
				stmt = con.prepareStatement("insert into studentinfo.student(sid,sname,lname) values(?,?,?)");
				stmt.setInt(1, std.getsId());
				stmt.setString(2, std.getsName());
				stmt.setString(3, std.getlName());
				insertRow = stmt.executeUpdate();
				System.out.println("Record Inserted Successfully:" + insertRow);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Student RetrieveStudent(int id) {
		Student std = new Student();
		st = getProInstance();
		try {
			stmt = st.getConnection().createStatement();
			String sql = "select * from studentinfo.student where sid='" + id + "'";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("SID || SNAME || LNAME");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " || " + rs.getString(2) + " || " + rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return std;
	}

	public void DisplayStudent() {
		Student std = new Student();
		st = getProInstance();
		try {
			stmt = st.getConnection().createStatement();
			String sql = "select * from studentinfo.student ";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("SID || SNAME || LNAME");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + " || " + rs.getString(2) + " || " + rs.getString(3) + "\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteStudent(int id) {
		st = getProInstance();
		try {
			String sql = "delete from studentinfo.student where sid=?";
			PreparedStatement stmt = st.getConnection().prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			System.out.println("Record Deleted Successfully...!");
			getProInstance().DisplayStudent();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*public void updateStudent(int id, Student s) {
		Student std=s;
		int updateRow = 0;
		Connection con = st.getConnection();
		Statement stmt = null;
		try {
			String sql = "UPDATE studentinfo.student SET sname = '"+std.getsName()+"' , lname ='"+std.getlName()+"' WHERE id = '"+id+"'";
			stmt = con.createStatement();
			updateRow = stmt.executeUpdate(sql);
			System.out.println("Record updated."+updateRow);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
	
	public void updateStudent(int id,Student s) {
		Student std = s;
		st = getProInstance();
		int updateRow = 0;
		try {
			stmt = st.getConnection().createStatement();
			PreparedStatement stmt;
			try {
				stmt = con.prepareStatement("update studentinfo.student SET sid=?,sname=?,lname=? where sid=?");
				stmt.setInt(1, id);
				stmt.setString(2, std.getsName());
				stmt.setString(3, std.getlName());
				stmt.setInt(4, id);
				updateRow = stmt.executeUpdate();
				System.out.println("Record Inserted Successfully:" + updateRow);
				getProInstance().DisplayStudent();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
