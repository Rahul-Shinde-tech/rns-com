class Employee{
	private static Employee obj = new Employee();
	
	private Employee(){
		
	}
	public void display(){
		System.out.println("Inside the Emplyee Singleton for Early Instantiations:");
	}
	public static Employee getInstance(){
		return obj;
	}
}

public class TestEmployee{
	public static void main(String args[]){
		Employee obj = Employee.getInstance();
		obj.display();
		
	}
	
	
}
/** OUTPUT ****

D:\rns-com\com.rns.singleton>javac TestEmployee.java

D:\rns-com\com.rns.singleton>java TestEmployee
Inside the Emplyee Singleton for Early Instantiations:


*/