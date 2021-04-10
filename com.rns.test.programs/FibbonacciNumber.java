import java.util.Scanner;
// Programe for Fibbonacy Num er
public class FibbonacciNumber{
	int a =0;
	int b = 1;
	int temp=0;
	
	public void Fibbonacy(int n){
		for(int i=0;i<n;i++){
			temp = a+b;
			a=b;
			b = temp;
			System.out.print(" "+temp);
		}
		
	}
	public static void main(String[] args){
		FibbonacciNumber fb = new FibbonacciNumber();
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		int num = Integer.parseInt(txt);
		System.out.print(fb.a);
		System.out.print(" "+fb.b+" ");
		fb.Fibbonacy(num);
		
		
	}
	
}