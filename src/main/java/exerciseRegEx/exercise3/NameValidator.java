package exerciseRegEx.exercise3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator {
    public boolean validate(String name){
        Pattern nameValiator = Pattern.compile("[A-ZŁ][a-ząężźł]+");
        Matcher matcher = nameValiator.matcher(name);
        return matcher.matches();
    }
}
