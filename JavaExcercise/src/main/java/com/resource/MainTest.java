package com.resource;

import java.util.List;

public class MainTest {
	public static void main(String[] args) {
		/*Student stud1 = new Student();
		stud1.setsName("Sachin");
		StudentDAO.saveStudent(stud1);
		Student stud2 = new Student();
		stud2.setsName("lara");
		StudentDAO.saveStudent(stud2);*/
		List<Student> stud=StudentDAO.getStudentList();
		System.out.println("No of Student:"+stud.size());
		for(Student s:stud) {
			System.out.println("Student No.:"+s.getsId()+"| Student Name:"+s.getsName());
		}
		for(Student s:stud) {
			//System.out.println("Student No.:"+s.getsId()+"| Student Name:"+s.getsName());
			System.out.println(s);
			
		}
		StudentDAO.getMethod(1);
		StudentDAO.loadMethod(2);
		
		
	}
	
}
