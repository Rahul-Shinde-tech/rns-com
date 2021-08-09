//Usage of Lambda Expression

@FunctionalInterface
interface MyFunctionalInterface{
	//Functional Interface 
	public String Display();
}

@FunctionalInterface
interface MyNewInterface{
	public String MyDisplay();
}

public class MyClass{
	public static void main(String args[]){
		// usage of Lambda Expression
		MyFunctionalInterface msg = () ->{
			return "Hi Hello World";
		};
		System.out.println(msg.Display());
		
		MyNewInterface massage =()->{ return " Hi My New Interface ";};
	
		System.out.println(massage.MyDisplay());
	}	
} 