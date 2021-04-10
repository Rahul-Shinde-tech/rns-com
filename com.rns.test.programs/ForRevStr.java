import java.util.Scanner;

public class ForRevStr{
	private static String strRevChar(String str){
			String rev ="";
			for(int i=str.length()-1;i>=0;i--){
				rev=rev+str.charAt(i);
			}
			return rev;
	}
	private static String strRev(String str){
		String rev = "";
		char[] res = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			rev= rev+res[i];
		}
		return rev;
	}
	private static StringBuffer strRevBuf(String str){
		return new StringBuffer().append(str).reverse();
	}
	private static StringBuilder strRevBld(String str){
		return new StringBuilder().append(str).reverse();
	}
	private static String strRec(String str){
		if(str.length()<2){
			return str;
		}
		return strRec(str.substring(1))+str.charAt(0); 
	}
	public static void main(String[] args){
		System.out.println("Enter the String for Reverse:");
		String str = new Scanner(System.in).next();
		System.out.println("Reverse By Using CharAt:"+strRevChar(str));
		System.out.println("Reverse By Using String Method:"+strRev(str));
		System.out.println("Reverse By Using StringBuffer:"+strRevBuf(str));
		System.out.println("Reverse By Using StringBuilder:"+strRevBld(str));
		System.out.println("Reverse By Using String Rec Method:"+strRec(str));
		
	}
}


/* -----Output-----
D:\MyPracticePrograms>javac ForRevStr.java

D:\MyPracticePrograms>java ForRevStr
Enter the String for Reverse:
JProgrammer
Reverse By Using CharAt:remmargorPJ
Reverse By Using String Method:remmargorPJ
Reverse By Using StringBuffer:remmargorPJ
Reverse By Using StringBuilder:remmargorPJ
Reverse By Using String Rec Method:remmargorPJ
*/