import java.lang.StringBuilder;
public class PalindromeSecond{
	public static void main(String[] args){
		char[] arr={1,2,3,4,2,1};
		isPalindrome(arr);
}
	
	public static void isPalindrome(char[] arr){
		String first = new String(arr);
		String second = new String(new StringBuilder(new String(arr)).reverse());
		if(first.equals(second)){
			System.out.println("Given String is Palindrome");	
		}else{
			System.out.println("Given String is Not a Palindrome");
		}
		
	}
	
}