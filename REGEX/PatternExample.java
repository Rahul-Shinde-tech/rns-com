import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    private static final String PASSWORD_PATTERN = "(^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=])(?=\\S+$).{8,}$)";  //d = [0-9]

    public static PasswordValidator(){
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }

    public boolean validate(final String password) {

        matcher = pattern.matcher(password);
        return matcher.matches();

    }

    public static void main(String[] args) {

        String inputPassword = "J@y!67tj";

        PasswordValidator passwordValidator = new PasswordValidator();
        System.out.println(passwordValidator.validate(inputPassword));

    }
}