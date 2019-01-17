package exerciseRegEx.exercise6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public boolean validate(String email){
        Pattern emailValidator = Pattern.compile("^([A-Za-z\\d]+|[A-Za-z\\d]+[.\\-+][A-Za-z\\d]+)+@[A-Za-z\\d]+\\.[a-z]+$");
        Matcher matcher = emailValidator.matcher(email);
        return matcher.matches();
    }
}
