package com.rns.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rns/xmlbased/configlife.xml");
		EmployeeDao empDao= context.getBean("employeeDao",EmployeeDao.class);
		
		Employee employee = new Employee(663,"Rahul Dravid","Kolkata");
		
		int result = empDao.saveEmployee(employee);
		/*ApplicationContext context = new ClassPathXmlApplicationContext("com/rns/xmlbased/configlife.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
		
		//Insert Query
		//String query="insert into Employee(id,name,address) values(?,?,?)";
		
		//Fire Query
		//int result = template.update(query,664,"Rohit Sharma","Puna");
		*/
		System.out.println("Insertion Successful:"+result);
	}
}
