package com;

import java.io.*;
import java.rmi.ServerException;
import javax.servlet.http.*;

public class Login extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException,IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 String title = "Using GET Method to Read Form Data";
		 String t="text";
		 String n="15";
		 String docType =
		 "<!doctype html public \"-//w3c//dtd html 4.0 " +
		 "transitional//en\">\n";
		 out.println(docType +
		 "<html>\n" +
		 "<head><title>" + title + "</title></head>\n" +
		 "<body bgcolor=\"#f0f0f0\">\n" + 
		 "<fieldset><legend><h3>Enter_Employee_Details</h3></legend>"+
		 "<table><tr><th>Employee Name:</th><th>Employee Age:</th><th>Employee City:</th></tr>"
		 + "<tr><td>"+ 
		 request.getParameter("Employee_Name") +
		 "</td><td>"+ 
		 request.getParameter("Employee_Age") +
		 "</td><td>"+ 
		 request.getParameter("Employee_City") +
		 "</td></tr>"+
		 "</table></fieldset> </body></html>");
		 
		 /*"<table><tr><th>Employee Name:</th><th>Employee Age:</th><th>Employee City:</th></tr><tr><td><input type="+
		 t+" name="+ 
		 request.getParameter("Employee_Name") +
		 "size="+n+"></td><td><input type="+t+" name="+ 
		 request.getParameter("Employee_Age") +
		 "size="+n+"></td><td><input type="+t+" name="+ 
		 request.getParameter("Employee_City") +
		 "size="+n+"></td></tr></table></fieldset> </body></html>");*/
				
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
			 doGet(request, response);
	}

}
