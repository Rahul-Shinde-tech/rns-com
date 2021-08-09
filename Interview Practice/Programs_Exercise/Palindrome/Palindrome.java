public class Palindrome{
	public static void main(String args[]){
		
		char[] arr = {'A','B','A'};
		isPalindrome(arr);
		
	}
	
	public static void isPalindrome(char[] arr){
		String first = new String(reverse(arr));
		String second = new String(arr);
		if(first.equals(second)){
			System.out.println("Given String is Palindrome");
		}
		else{
			System.out.println("Given String is Not a Palindrome");
		}
	}
	
	public static char[] reverse(char[] arr){
		char[] result = new char[arr.length];
		for(int j=0;j<result.length;j++){
			result[j]= arr[(arr.length-1)-j]; 
		}
		return result;
	}
}

/* OUTPUT

D:\rns-com\Interview Practice\Programs_Exercise\Palindrome>javac Palindrome.java

D:\rns-com\Interview Practice\Programs_Exercise\Palindrome>java Palindrome
Given String is:
 ☺ ☻ ☺
Reverse of a String is:
☺☻☺
Given String is Palindrome

D:\rns-com\Interview Practice\Programs_Exercise\Palindrome>javac Palindrome.java

D:\rns-com\Interview Practice\Programs_Exercise\Palindrome>java Palindrome
Given String is:
 ☺ ☻ ♥ ☺
Reverse of a String is:
☺♥☻☺
Given String is Not a Palindrome

D:\rns-com\Interview Practice\Programs_Exercise\Palindrome>javac Palindrome.java

D:\rns-com\Interview Practice\Programs_Exercise\Palindrome>java Palindrome
Given String is Not a Palindrome

D:\rns-com\Interview Practice\Programs_Exercise\Palindrome>javac Palindrome.java

D:\rns-com\Interview Practice\Programs_Exercise\Palindrome>java Palindrome
Given String is Palindrome

D:\rns-com\Interview Practice\Programs_Exercise\Palindrome>javac Palindrome.java

D:\rns-com\Interview Practice\Programs_Exercise\Palindrome>java Palindrome
Given String is Palindrome

D:\rns-com\Interview Practice\Programs_Exercise\Palindrome>

*/