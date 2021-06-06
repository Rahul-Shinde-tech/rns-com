package com.resource;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Dmain {
	private static int idelTime=0;
	private static int totalRecords=0;
	
	/*public static void main(String[] args) {
		
	}
	public static void getFlight(int flightNo ){
	      Session session = HibernateUtil.getSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         List flight = session.createQuery("FROM FlightDetails").list();
	         Object[][] arr = new Object[100][100];
	         int j=0;
	         for (Iterator iterator = flight.iterator(); iterator.hasNext();){
	        	FlightDetails f1 = (FlightDetails) iterator.next();
	            arr[totalRecords][j]=f1.getFlightArrivalTime();
	            j++;
	            totalRecords+=1;
	         }
	         System.out.println("Record Submitted Successfully:");
	         tx.commit();
	      } catch (Exception e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
*/}
