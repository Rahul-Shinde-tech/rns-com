import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEmail {
	public boolean validate(String str) {
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher = pattern.matcher(str);
		return matcher.find();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		if(new TestEmail().validate(str)) {
			System.out.println("Email id is valid ");
		}else
		{
			System.out.println("Email id is not valid:");
		}

	}

}

/*OUTPUT
 * 
 * rahul@gmail.com
 * Email id is valid 
 * 
 * rah .gmail.com
 * Email id is not valid:*/

/* Pattern - "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"

^ matches the starting of the sentence.

[a-zA-Z0-9+_.-] matches one character from the English alphabet (both cases), digits, “+”, “_”, “.” and, “-” 
before the @ symbol

+ indicates the repetition of the above-mentioned set of characters one or more times.

@ matches itself.

[a-zA-Z0-9.-] matches one character from the English alphabet (both cases), digits, “.” and “–” after the @ symbol.

$ indicates the end of the sentence.*/

