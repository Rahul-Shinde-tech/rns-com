import java.util.Scanner;


public class TestOnString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String for Reverse:");
		String givenString = scan.next();
		if(givenString.equals(null) && givenString.isEmpty()) {
			System.out.println("Please Enter Valid String:");
		}
		else
		{
			System.out.println("The Reserve of a String Using String :"+new TestOnString().StringReverse(givenString));
			System.out.println("The Reserve of a String Using String :"+new TestOnString().ReverseByCharAt(givenString));
			System.out.println("Reverse of af a String Using String Buffer:"+new TestOnString().ReverseByStringBuffer(givenString));
			System.out.println("Reverse of a String using String Builder:"+new TestOnString().ReverseByStringBuilder(givenString));
			System.out.println("The Reserve of a String Using Reccursion Method :"+new TestOnString().StringReccursion(givenString));
			
		}
		
		
	}

	public String StringReverse(String str) {
		char[] s = str.toCharArray();
		String res="";
		for(int i=s.length-1;i>=0;i--) {
			res=res+s[i];
		}
		return res;
	}
	public String ReverseByCharAt(String str) {
		String res="";
		for(int j=str.length()-1;j>=0;j--) {
			res=res+str.charAt(j);
		}
		return res;
	}
	public StringBuffer ReverseByStringBuffer(String givenString) {
			return new StringBuffer().append(givenString).reverse();
	}
	public StringBuilder ReverseByStringBuilder(String gs) {
		return new StringBuilder().append(gs).reverse();
	}
	public String StringReccursion(String str) {
		if(str.length()<2) {
			return str;
		}
		return StringReccursion(str.substring(1))+str.charAt(0);
	}
	
}



/* Output Will be...
D:\MyPracticePrograms>javac TestOnString.java

D:\MyPracticePrograms>java TestOnString
Enter the String for Reverse:
Rahul
The Reserve of a String Using String :luhaR
The Reserve of a String Using String :luhaR
Reverse of af a String Using String Buffer:luhaR
Reverse of a String using String Builder:luhaR
The Reserve of a String Using Reccursion Method :luhaR

D:\MyPracticePrograms>

*/
