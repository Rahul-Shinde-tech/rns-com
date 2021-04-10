package PackageC;
/* 
 * NON ACCESS MODIFIER 
 * Final - 
 * Static -
 * Transient - Object are sharing file or data through the network TCPIP or protocols 
 * Abstract - The name itself knowing as Abstract or under Process Mostly used for declaring the class and method 
 * Synchronized - Used in Thread Concept when two threads are sharing same data
 * Volatile - Is same as Synchronized and used in the Thread concept for sharing same Data by Lock and Dead Lock
 * Native - Is used for Another language operations purpose 
 */
public class SampleDD { 
	//if we are kept SampleDD as a final class then SampleCC can not be extended this class
	static final int a = 10;
		 static int b=20;
		 public final void display() {
			 System.out.print("Hello Java..");
		 }
		 
	public final int addMath(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a=30;// Showing Error Final Filed cannot be assigned 
		b= 40; //Which is valid 
		SampleDD d = new SampleDD();
		//SampleDD.a=40; // Showing Error Final Filed cannot be assigned 
	}
}