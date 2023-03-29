import java.util.ArrayList;
import java.util.List;
import org.apache.commons.validator.routines.EmailValidator;

public class EmailValidation {
   public static boolean isValidEmail(String email) {
       // create the EmailValidator instance
       EmailValidator validator = EmailValidator.getInstance();

       // check for valid email addresses using isValid method
       return validator.isValid(email);
   }

   public static void main(String[] args) {
       List<String> emails = new ArrayList<String>();

       // valid email addresses
       emails.add("email@example.com");
       emails.add("email.bob@example.com");

       //invalid email addresses
       emails.add("email.example.com");
       emails.add("email..bob@example.com");

       for (String value : emails) {
           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
       }
   }
}
