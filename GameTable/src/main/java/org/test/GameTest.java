package org.test;

public class GameTest {
	//static String fileUrl = "C:\\Users\\admin\\Desktop\\Game File\\gamefile101.csv";
	//static String fileUrl1 = "C:\\Users\\admin\\Desktop\\Game File\\gamefilesmall101.csv";
	static String fileUrl = "C:\\Users\\admin\\Desktop\\Game File\\A.csv";
	
	public static void main(String[] args) throws Exception {
		//FileTest.FileInput(fileUrl);
		NewFileTest.FileInput(fileUrl);
		System.out.println("File Submitted SuccessFully:");
		HibernateUtil.loadSessionFactory().close();
	}

}
