class A{
	A getA(){
		return this;	
	}
	void display() {
		System.out.println("Inside the Display Method of B:");
	}
}
public class Test6 {
	public static void main(String[] args) {
		//getA() returns current object 
		new A().getA().display();
		
	}
}

/*

OUTPUT 
D:\rns-com\com.rns.samples>javac Test6.java

D:\rns-com\com.rns.samples>java Test6
Inside the Display Method of B:

D:\rns-com\com.rns.samples>

*/