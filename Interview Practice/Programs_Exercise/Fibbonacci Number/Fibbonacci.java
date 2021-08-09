
public class Fibbonacci{
	public static void main(String args[]){
		
		fibbonacciNumber(5);
	}
	
	public static void fibbonacciNumber(int num){
		int first = 0;
		int second =1;
		int temp =0;
		System.out.println("Fibbonaccy Numbers are:");
		System.out.print(first+" "+second);
		int i=0;
		while(i<=num){
			i++;
			temp= first+second;
			first=second;
			second=temp;
			System.out.print(" "+temp);
		}
		System.out.println("Completed:");
	}
}
/* Output 
D:\rns-com\Interview Practice\Programs_Exercise\Fibbonacci Number>javac Fibbonacci.java

D:\rns-com\Interview Practice\Programs_Exercise\Fibbonacci Number>java Fibbonacci
Fibbonaccy Numbers are:
0 1 1 2 3 5 8 13Completed:

D:\rns-com\Interview Practice\Programs_Exercise\Fibbonacci Number>
*/