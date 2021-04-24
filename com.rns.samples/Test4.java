public class Test4{
	public Test4(){
		System.out.println("Test4 Dafault Constructor:");
	}
	public Test4(int x){
		this();
		System.out.println("Test4 Parameterised Constructor:"+x);	
	}
		
	public static void main(String s[]){
		Test4 ts = new Test4(10);
		
	}
}
/*
OUTPUT 

Microsoft Windows [Version 10.0.18363.1500]
(c) 2019 Microsoft Corporation. All rights reserved.

D:\rns-com\com.rns.samples>javac Test4.java
Test4.java:7: error: call to this must be first statement in constructor
                this();
                    ^
1 error

D:\rns-com\com.rns.samples>javac Test4.java
Test4.java:7: error: call to this must be first statement in constructor
                this();
                    ^
1 error

D:\rns-com\com.rns.samples>javac Test4.java

D:\rns-com\com.rns.samples>java Test4
Test4 Dafault Constructor:

D:\rns-com\com.rns.samples>javac Test4.java
Test4.java:5: error: invalid method declaration; return type required
        public Test(int X){
               ^
1 error

D:\rns-com\com.rns.samples>javac Test4.java
Test4.java:6: error: cannot find symbol
                System.out.println("Test4 Parameterised Constructor:"+x);
                                                                      ^
  symbol:   variable x
  location: class Test4
1 error

D:\rns-com\com.rns.samples>javac Test4.java

D:\rns-com\com.rns.samples>java Test4
Test4 Parameterised Constructor:10

D:\rns-com\com.rns.samples>
// After using this() in parameterised constructor it will call default constructor
D:\rns-com\com.rns.samples>javac Test4.java

D:\rns-com\com.rns.samples>java Test4
Test4 Dafault Constructor:
Test4 Parameterised Constructor:10

D:\rns-com\com.rns.samples>


*/