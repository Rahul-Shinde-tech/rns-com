public class MyTestClass{
	public static void main(String args[]){
		Address add = new Address();
		add.setCity("Mumbai");
		add.setPinCode(123);
		
		Student stud = new Student(1,"Sachin",add);
		System.out.println("Result Completed");
		
		System.out.println(stud.toString());
		System.out.println(add.toString());
		
		stud.getAddress().setCity("Pune");
		stud.getAddress().setPinCode(233);
		
		System.out.println(stud.toString());
		System.out.println(add.toString());
		
		System.out.println("Successful...");
	}
}