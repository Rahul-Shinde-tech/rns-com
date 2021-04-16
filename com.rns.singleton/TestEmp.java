// Program example for lazy instatiations

class Employee{
	private static Employee obj;
	
	private Employee(){
	}
	
	public void display(){
		System.out.println("Inside the Employee Singleton lazy Instantation");
	}
	public static Employee getInstance(){
		if(obj==null){
			obj = new Employee();
		}
	return obj;
	}
}

public class TestEmp{
	public static void main(String args[]){
		Employee obj = Employee.getInstance();
		obj.display();
	}
} 

/* *** OUTPUT ****
D:\rns-com\com.rns.singleton>javac TestEmp.java

D:\rns-com\com.rns.singleton>java TestEmp
Inside the Employee Singleton lazy Instantation
*/

