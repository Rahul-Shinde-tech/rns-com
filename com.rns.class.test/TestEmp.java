// Program example for lazy instatiations

class Employee{
	private static Employee obj;
	
	private Employee(){
	}
	
	public void display(){
		System.out.println("Inside the Employee Singleton lazy Instantation");
	}
	public static Employee getInstance(){
		if(null==Obj){
			obj = new Employee();
		}
	return obj;
	}
}

public class TestEmp{
	public static void main(String args[]){
		Employee obj = Emplyee.getInstance();
		obj.display();
	}
} 

/* *** OUTPUT ****

*/

