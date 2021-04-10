import java.sql.*;
import java.util.Scanner;

class RetStudInfo{
	public static void main(String[] args){
		Connection con= null;
		Statement stmt = null;
		String url= "jdbc:mysql://localhost:3306/studentdatabase";
		String usr ="root";
		String pwd = "root";
		try{
			con = Drivermanager.getConnection(url,usr,pwd);
			if(con!=null){
				System.out.println("Server Connection estalished:");
				
			}
			else{
				System.out.println("Server Connection Failed:");
			}
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
		
	}
}