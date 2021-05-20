package com.stud.test;

import com.stud.resource.Student;
import com.stud.resource.StudentProcess;

public class StudentTest {

	public static void main(String[] args) {
		StudentProcess.display();
		System.out.println();
		Student std = new Student(4,"Sachin","Tendulkar",20,20);
		StudentProcess.saveStudent(std);
		System.out.println();
		//StudentProcess.deleteStudent(4);
		System.out.println();
		Student s2 = new Student(3,"Rahul","Dravid",9,19);
		StudentProcess.updateStudent(3, s2);
	}

}
/*  >>>>>>>>>>>>>OUTPUT<<<<<<<
 *Connection established...!
SID || FIRSTNAME || LASTNAME || SUBJECT1 || SUBJECT2 

1 || Goutam || Gambhir || 20 || 19
2 || Kedar || Bhave || 15 || 11
3 || Chandu || Borde || 10 || 12
5 || Abhi || nayar || 17 || 11

Connection established...!
Statement Established:
Record Inserted Successfull:
Connection established...!
SID || FIRSTNAME || LASTNAME || SUBJECT1 || SUBJECT2 

1 || Goutam || Gambhir || 20 || 19
2 || Kedar || Bhave || 15 || 11
3 || Chandu || Borde || 10 || 12
5 || Abhi || nayar || 17 || 11
4 || Sachin || Tendulkar || 20 || 20


Connection established...!
Updated Sucessful..
Connection established...!
SID || FIRSTNAME || LASTNAME || SUBJECT1 || SUBJECT2 

1 || Goutam || Gambhir || 20 || 19
2 || Kedar || Bhave || 15 || 11
3 || Rahul || Dravid || 9 || 19
5 || Abhi || nayar || 17 || 11
4 || Sachin || Tendulkar || 20 || 20
 
 *
*/