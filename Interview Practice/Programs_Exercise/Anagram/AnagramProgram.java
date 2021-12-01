import java.util.Arrays;
public class AnagramProgram{
	public static void main(String[] args){
		String strOne ="army";
		String strSecond ="mary";
		char[] chrOne = strOne.toLowerCase().toCharArray();
		char[] chrSecond = strSecond.toLowerCase().toCharArray();
		
		isAnagram(chrOne,chrSecond);
		if(isAnagram(chrOne,chrSecond)==true){
			System.out.println("Two String are Anagram:");
		}else{
			System.out.println("Two Strinngs are Not Anagram:");
		}
	}
	
	public static Boolean isAnagram(char[] one,char[] second){
		Arrays.sort(one);
		Arrays.sort(second);
		return(Arrays.equals(one,second));
		
	}
}