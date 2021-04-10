package com.rns.String_Methods;

import java.util.Scanner;

/* 
 * Write a Program to reverse of given String using different ways
 * using convert into String and forLoops 
 * using StringBuffer, StringBuilder reverse methods 
 * using 
 * */

public class StringMethods {
	static private StringBuffer revUsingMethod(String str) {
		StringBuffer res= new StringBuffer(str);
		return res.reverse();
	}
	
	static private StringBuilder revStringBuilder(String str) {
		StringBuilder rev = new StringBuilder(str);
		return rev.reverse();
	}
	static private String revUsingFor(String str) {
		char[] rev = str.toCharArray();
		String res ="";
		for(int i=str.length()-1;i>=0;i--) {
			res = res+rev[i];
		}
		return res; 
	}
	
	static private String revUsingCharat(String str) {
		String res= "";
		for(int i =str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String str = scr.nextLine();
		System.out.println("1 :-"+revUsingMethod(str));
		System.out.println("2 :-"+revStringBuilder(str));
		//System.out.println(str.length());
		System.out.println("3 :-"+revUsingFor(str));
		System.out.println("4 :-"+revUsingCharat(str));
		
	}

}
