package exerciseRegEx.exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlateValidator {
    public boolean validate(String plate){
        Pattern plateValidator = Pattern.compile("[A-Z]{2}(\\d{5}|\\d{4}[A-Z]|\\d{3}[A-Z]{2})");
        Matcher matcher = plateValidator.matcher(plate);
        return matcher.matches();
    }
}
