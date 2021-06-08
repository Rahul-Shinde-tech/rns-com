package org.rns;

import org.test.HibernateUtil;
import org.test.NewFileTest;

public class GameTest {
static String fileUrl = "C:\\Users\\admin\\Desktop\\Game File\\A.csv";
	
	public static void main(String[] args) throws Exception {
		//FileTest.FileInput(fileUrl);
		NewFile.FileInput(fileUrl);
		System.out.println("File Submitted SuccessFully:");
	}
}
