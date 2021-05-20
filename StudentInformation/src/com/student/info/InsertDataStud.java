package com.student.info;
import java.sql.*;
import java.util.Scanner;

public class InsertDataStud {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:mysql://localhost:3306/studentdatabase";
		String usr= "root";
		String pwd = "root";
		try {
			
			con = DriverManager.getConnection(url,usr,pwd);
			if(con!=null) {
				System.out.println("Server Started>>>..");
				System.out.println("Choose operation.. 1. for Show Table 2. for Insert opertion \n");
				Scanner scan = new Scanner(System.in);
				int i=scan.nextInt();
				//scan.close();
				switch(i) {
					case 1:	stmt = con.createStatement();
							String qry= "select sno,sname,subject1,subject2 from studentinfo";
							if(stmt!=null) {
								System.out.println("Statement Started Executing..\n");
								System.out.println("SNO| SNAME | SUBJECT1 |Subject2  |\n");
								ResultSet rs = stmt.executeQuery(qry);
								while(rs.next()) {
									System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" \n ");
								}
							stmt=null;
							}
							else
							{
								System.out.println("Statement Failed to executes...");
							}
							break;						
					case 2: stmt = con.createStatement();
							if(stmt!=null) {
								System.out.println("Statement Started Executing.. Please Insert data 1. Sno. 2. Name 3. Subject1 4 Subject2\n");
								Scanner sca = new Scanner(System.in);
								int sno = sca.nextInt();
								String sname = sca.next();
								String subject1 = sca.next();
								String subject2 = sca.next();
								String qry1="insert into studentinfo values('"+sno+"','"+sname+"','"+subject1+"','"+subject2+"')";
								stmt.executeUpdate(qry1);
								System.out.println("Data Saved Successfully:");
							}	
							break;
					default: break;
				}
				
				scan.close();
				
			}
			else {
				System.out.println("Server Failed>>>..");
			}
		}
		catch(SQLException e1){
			e1.printStackTrace();
		}
		finally{
			System.out.println("Server went for Sleep:");
			stmt= null;
			con=null;
			
		}

	}

	private static int toparseInt(String next) {
		// TODO Auto-generated method stub
		return 0;
	}

}
