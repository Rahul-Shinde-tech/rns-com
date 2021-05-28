package com.resouce;

import java.util.Random;
 
public class Usertest {
	private static String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String lowCapLtr = "abcdefghijklmnopqrstuvwxyz";
	private static String speChar = "!@#%*$[](){}";
	private static String numbers = "1234567890";
	private static int length = 10, strength = 1;

	public static void main(String[] args) {
		System.out.println("Enter Length for Password generation between 6 to 10:");
		System.out.println("Length:"+length+",Strength:"+strength);
		if(length>=6 && length <= 10 ) {
			System.out.println("Enter Strength for Password between 1 2 3 :");
			
			if(strength ==1 ) {
				System.out.println(generateWeakPassword(length, strength));
				System.out.println(generateWeakPassword(length, strength));
				System.out.println(generateWeakPassword(length, strength));
				
			}else if(strength ==2){
				System.out.println(generateStrongPassword(length, strength));
				System.out.println(generateStrongPassword(length, strength));
				System.out.println(generateStrongPassword(length, strength));
				
			}else if(strength==3) {
				System.out.println(generateExStrongPassword(length, strength));
				System.out.println(generateExStrongPassword(length, strength));
				System.out.println(generateExStrongPassword(length, strength));
				
			}else {
				System.out.println("Please Enter Strength Correctly:");
			}
		}else {
			System.out.println("Please Enter Length Correctly:");
		}
	}

	private static char[] generateExStrongPassword(int length, int strength) {

		String comChar = capLetter + lowCapLtr + speChar + numbers;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = lowCapLtr.charAt(random.nextInt(lowCapLtr.length()));
		password[1] = capLetter.charAt(random.nextInt(capLetter.length()));
		password[2] = speChar.charAt(random.nextInt(speChar.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 4; i < length; i++) {
			password[i] = comChar.charAt(random.nextInt(comChar.length()));
		}
		return password;

	}
	private static char[] generateWeakPassword(int length, int strength) {

		String comChar = capLetter + lowCapLtr;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = lowCapLtr.charAt(random.nextInt(lowCapLtr.length()));
		password[1] = capLetter.charAt(random.nextInt(capLetter.length()));
		password[2] = lowCapLtr.charAt(random.nextInt(lowCapLtr.length()));
		password[3] = capLetter.charAt(random.nextInt(capLetter.length()));

		for (int i = 4; i < length; i++) {
			password[i] = comChar.charAt(random.nextInt(comChar.length()));
		}
		return password;

	}
	private static char[] generateStrongPassword(int length, int strength) {

		String comChar = capLetter + lowCapLtr + numbers;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = lowCapLtr.charAt(random.nextInt(lowCapLtr.length()));
		password[1] = capLetter.charAt(random.nextInt(capLetter.length()));
		password[2] = lowCapLtr.charAt(random.nextInt(lowCapLtr.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 4; i < length; i++) {
			password[i] = comChar.charAt(random.nextInt(comChar.length()));
		}
		return password;

	}
}
