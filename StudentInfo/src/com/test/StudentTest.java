package com.test;

import com.resourece.StudProcess;
import com.resourece.Student;

public class StudentTest {

	public static void main(String[] args) {
		StudProcess.getProInstance().DisplayStudent();
		Student s = new Student(4, "Jounty", "Roads");
		StudProcess.getProInstance().saveStudent(s);
		Student s1 = new Student(5, "Yuvraj", "Singh");
		StudProcess.getProInstance().saveStudent(s1);
		StudProcess.getProInstance().RetrieveStudent(1);
		StudProcess.getProInstance().deleteStudent(0);
		StudProcess.getProInstance().updateStudent(1, new Student(1, "Sachin", "Tendulkar"));
	}
	
}
//OUTPUT 

/*
 * SID || SNAME || LNAME
1 || Brain || lara
2 || Virendra || Sehwagh
3 || Virat || Kohli
Record Inserted Successfully:1
Record Inserted Successfully:1
SID || SNAME || LNAME
1 || Brain || lara
Record Deleted Successfully...!
SID || SNAME || LNAME
1 || Brain || lara
2 || Virendra || Sehwagh
3 || Virat || Kohli
4 || Jounty || Roads
5 || Yuvraj || Singh
Record Inserted Successfully:1
SID || SNAME || LNAME
1 || Sachin || Tendulkar
2 || Virendra || Sehwagh
3 || Virat || Kohli
4 || Jounty || Roads
5 || Yuvraj || Singh
 */
