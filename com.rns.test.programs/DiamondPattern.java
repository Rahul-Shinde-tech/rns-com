public class DiamondPattern{
	int a;
	public void m1(int a){
		System.out.println("calling single int:");
		this.a=a;
	}
	public void m1(int... a){
		System.out.println("Calling Var Int");
		a= a;
		
	}
	public static void main(String[] args ){
		
		new DiamondPattern().m1(10,10,10);
	}
}


/*** OUTPUT ****
* D:\MyPracticePrograms>javac DiamondPattern.java
* 
* D:\MyPracticePrograms>java DiamondPattern
* calling single int:
* 
* D:\MyPracticePrograms>javac DiamondPattern.java
* 
* D:\MyPracticePrograms>java DiamondPattern
* calling single int:
* 
* D:\MyPracticePrograms>
*/