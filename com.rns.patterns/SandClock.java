public class SandClock {

	public static void main(String[] args) {
		int rows;
		int columns;
		int space=1;
		int stars=5;
		int height=stars-2;
		for(rows=1;rows<=height;rows++) {
			
			for(columns=1;columns<=space;columns++) {
				System.out.print(" ");
			}
			space=space+1;
			for(columns=1;columns<=stars;columns++) {
				System.out.print("*");
			}
			stars=stars-2;
			System.out.println();
		}
		for(rows=1;rows<=height;rows++) {
			space=space-1;
			for(columns=1;columns<=space;columns++) {
				System.out.print(" ");
			}
			
			stars=stars+2;
			for(columns=1;columns<=stars;columns++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println("A");
	}
}
/*  

OUTPUT 


Microsoft Windows [Version 10.0.19042.985]
(c) Microsoft Corporation. All rights reserved.

D:\rns-com\com.rns.patterns>Javac SandClock.java

D:\rns-com\com.rns.patterns>java SandClock
 *****
  ***
   *
   *
  ***
 *****
A

D:\rns-com\com.rns.patterns>


 *****
  ***
   *
   *
  ***
 *****
A

*/