package com.TPH;

import org.hibernate.Session;

import com.embeddeding.HibernateUtil;

public class TestMain {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Employee emp = new Employee();
		emp.seteName("Sachin");
		
		RegularEmployee remp = new RegularEmployee();
		remp.seteName("Virendra");
		remp.setSalary(10000);
		remp.setBonus(1200);
		
		Employee emp1 = new Employee();
		emp1.seteName("Virat");
		
		ContractEmployee cemp = new ContractEmployee();
		cemp.seteName("Rohit");
		cemp.setContractDuration(12);
		cemp.setPayPerHour(200);
		
		session.save(emp);
		session.save(emp1);
		session.save(cemp);
		session.save(remp);
		
		session.getTransaction().commit();
		session.close();
	}
}
