package com.rns.javabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(com.rns.javabasedconfig.JavaConfig.class);
		
		//Student student = new Student(666,"Brain Lara","Delhi");
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("MS Dhoni");
		student.setAddreess("Coachi");
		StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
		int result = studentDao.saveStudent(student);
		
		System.out.println("Result Successful:"+result);
	}
}
