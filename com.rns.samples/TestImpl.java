class A 
{
	public static void display(){
		System.out.println("Inside Class A");
	}
}

class B extends A
{
		public static void display(){
			System.out.println("Inside Method of class B:");
		}
}

public class TestImpl{
	public static void main(String[] args){
		
		B ref = new B();
		ref.display();
	}
}