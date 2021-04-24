public class Test5{
	public Test5(){
		this(10);
		System.out.println("Test4 Dafault Constructor:");
	}
	public Test5(int x){
		System.out.println("Test4 Parameterised Constructor:"+x);	
	}
		
	public static void main(String s[]){
		Test5 ts = new Test5();
		
	}
}

/*
Calling Parameteised Constructor Using dafault Constructor
D:\rns-com\com.rns.samples>javac Test5.java

D:\rns-com\com.rns.samples>java Test5
Test4 Parameterised Constructor:10
Test4 Dafault Constructor:

D:\rns-com\com.rns.samples>
*/