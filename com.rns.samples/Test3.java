
//comflict in Method or Why we need to us this Keyword
public class Test3{
	int a,b;
	
	public Test3(int a, int b){
		this.a=a;
		this.b=b;
	}
	/*public Test3(int a, int b){
		this.a=a;
		this.b=b;
	}*/
	public void display(){
		System.out.println(a+" "+b);
	}
	public static void main(String args[]){
		Test3 ts = new Test3(10,20);
		ts.display();
	
	}
	
}

/*
OUTPUT

D:\rns-com\com.rns.samples>javac Test3.java

D:\rns-com\com.rns.samples>java Test3
0 0
D:\rns-com\com.rns.samples>javac Test3.java

D:\rns-com\com.rns.samples>java Test3
10 20


*/