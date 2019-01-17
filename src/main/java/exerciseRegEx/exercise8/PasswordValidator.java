package exerciseRegEx.exercise8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public boolean validate(String password){
        Pattern passwordValidator = Pattern.compile("^(?=(?:.*[A-Z].*){2})(?=(?:.*[a-z].*){2})(?=(?:.*\\d.*))(?=(?:.*[+\\-)(*&^%$#@!<>?\":].*)).{8,16}$");
        Matcher matcher = passwordValidator.matcher(password);
        return matcher.matches();
    }
}
