abstract class a{
	
	
}
class b extends Test1{
	protected void m1(){
		System.out.println("Inside B M1:");
	}
}
class Test1{
	private void m1(){
		System.out.println("Inside A M1:");
	}
	public static void main(String[] args){
		b ab = new b();
		ab.m1();
	}
}