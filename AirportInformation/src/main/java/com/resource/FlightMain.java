package com.resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

public class FlightMain {
	public static void main(String[] args) throws ParseException {
		/*
		 * FlightDetails flight = FlightDetails.getInstance();
		 * flight.setFlightRecord(1); flight.setFlightNo(7002);
		 * flight.setFlightName("AirIndia"); flight.setFlightCountryName("India");
		 * flight.setFlightSource("Mumbai"); flight.setFlightDestination("Qatar"); Date
		 * dept = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-01-01 01:30:30");
		 * flight.setFlightDepTime(dept); Date arr = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-01-01 03:30:30");
		 * flight.setFlightArrivalTime(arr); SaveFlightDetails(flight);
		 * 
		 * FlightDetails flight3 = FlightDetails.getInstance();
		 * flight3.setFlightRecord(2); flight3.setFlightNo(7003);
		 * flight3.setFlightName("AirIndia"); flight3.setFlightCountryName("India");
		 * flight3.setFlightSource("Mumbai"); flight3.setFlightDestination("Qatar");
		 * Date dept3 = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-01-01 15:30:30");
		 * flight.setFlightDepTime(dept3); Date arr3 = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-01-01 17:30:30");
		 * flight.setFlightArrivalTime(arr3); SaveFlightDetails(flight3);

		FlightDetails flight2 = FlightDetails.getInstance();
		flight2.setFlightRecord(2);
		flight2.setFlightNo(7003);
		flight2.setFlightName("AirIndia");
		flight2.setFlightCountryName("India");
		flight2.setFlightSource("Qatar");
		flight2.setFlightDestination("Mumbai");
		Date dept2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-01-01 12:30:30");
		flight2.setFlightDepTime(dept2);
		Date arr2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-01-01 14:30:30");
		flight2.setFlightArrivalTime(arr2);
		SaveFlightDetails(flight2);
		 */
		listRecords();
	
	}

	public static void SaveFlightDetails(FlightDetails flight) {

		try (Session session = HibernateUtil.getSession()) {
			session.beginTransaction();
			session.save(flight);

			session.getTransaction().commit();
			session.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void listRecords() {
		try (Session session = HibernateUtil.getSession()) {
			session.beginTransaction();
			List flights = session.createQuery("FROM flightdetails").list();
			for (Iterator iterator = flights.iterator(); iterator.hasNext();) {
				FlightDetails f1 = (FlightDetails) iterator.next();
				System.out.print("Record No: " + f1.getFlightRecord());
				System.out.print("Flight No: " + f1.getFlightNo());
				System.out.print("Flight Source: " + f1.getFlightSource());
				System.out.print("Flight Destination " + f1.getFlightDestination());
				System.out.print("Flight Arrival Time: " + f1.getFlightArrivalTime());
				System.out.print("Flight Departure Time" + f1.getFlightDepTime());
				System.out.print("Flight Country Name: " + f1.getFlightCountryName());
				System.out.print("Flight Company Name: " + f1.getFlightCountryName());
				
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
