import org.apache.commons.validator.routines.EmailValidator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class checkmai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap email");
        String emailAddress = sc.nextLine();

        System.out.println("Result: " + EmailValidator.getInstance().isValid(emailAddress));
//        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
//                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
//        System.out.println("Result: " + patternMatches(emailAddress, regexPattern));
    }
    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
}
