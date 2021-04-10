package Package_A;
/* Access Modifier are as follows 
 * There are two types of Access Modifiers Access Modifiers and Non Access Modifiers 
 * Access Modifier are of 4 Types 
 * Public : Across world 
 * Private : within the class level 
 * Protected : within package and The Child class is present in another class 
 * Default : Within package 
 */
public class ClassA {
	private int a = 10;
	public int b= 20;
	int c =30;
	protected int d = 40;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA d = new ClassA();
		ClassC c = new ClassC();
		System.out.println(d.a+d.b+d.c+d.d);
		System.out.println(c.g);
		System.out.println(c.h);
		System.out.println(c.j);
		
	}

}