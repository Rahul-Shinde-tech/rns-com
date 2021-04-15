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
/* 	OUTPUT
D:\rns-com\REGEX>javac TestEmail.java

D:\rns-com\REGEX>java TestEmail
rahul@gmail.com
Email id is valid

D:\rns-com\REGEX>java TestEmail
rha kjndkfj
Email id is not valid:

D:\rns-com\REGEX>

*/

