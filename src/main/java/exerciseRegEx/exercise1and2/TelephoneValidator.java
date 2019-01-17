package exerciseRegEx.exercise1and2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneValidator {
    public boolean validate (String telephone){
        Pattern telephoneValidator = Pattern.compile("(\\+\\d{2}|)(\\d{9}|\\d{3} \\d{3} \\d{3}|\\d{3}-\\d{3}-\\d{3})");
        Matcher matcher = telephoneValidator.matcher(telephone);
        return matcher.matches();
    }
}
