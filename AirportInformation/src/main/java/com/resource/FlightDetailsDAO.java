package com.resource;

import org.hibernate.Session;

public class FlightDetailsDAO {

	public static Session session = null;

	public static void saveFlightDetails() {
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateFlightDetails() {
		try {
			session = HibernateUtil.getSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
