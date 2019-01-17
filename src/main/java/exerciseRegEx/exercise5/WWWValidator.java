package exerciseRegEx.exercise5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WWWValidator {
    public boolean validate(String address){
        Pattern wwwValidator = Pattern.compile("^www\\..+\\..+");
        Matcher matcher = wwwValidator.matcher(address);
        return matcher.matches();
    }
}
