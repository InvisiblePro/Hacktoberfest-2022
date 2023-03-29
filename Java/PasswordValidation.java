import java.util.ArrayList;
import java.util.List;

public class PasswordValidation {
    public static void main(String[] args) {
        List<String> passwords = new ArrayList<>();
        passwords.add("P@ssw0rd");
        passwords.add("password");

        for (String password : passwords){
            if (validatePassword(password)){
                System.out.println("Correct!");
            }else {
                System.out.println("Wrong!");
            }
        }
    }

    /*  ^                 # start-of-string
        (?=.*[0-9])       # a digit must occur at least once
        (?=.*[a-z])       # a lower case letter must occur at least once
        (?=.*[A-Z])       # an upper case letter must occur at least once
        (?=.*[@#$%^&+=])  # a special character must occur at least once
        (?=\S+$)          # no whitespace allowed in the entire string
       .{8,}              # anything, at least eight places though
        $                 # end-of-string
        Source            # https://stackoverflow.com/questions/3802192/regexp-java-for-password-validation
 */
    private static boolean validatePassword(String password){
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        return password.matches(pattern);
    }
}
