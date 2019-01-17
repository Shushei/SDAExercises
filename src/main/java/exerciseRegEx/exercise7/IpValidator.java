package exerciseRegEx.exercise7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpValidator {
    public boolean validate(String ipAdress){
        Pattern ipValidator = Pattern.compile("(25[0-5]|2[0-4][0-9]|1\\d{2}|\\d{2}|\\d)\\.(25[0-5]|2[0-4][0-9]|1\\d{2}|\\d{2}|\\d)\\.(25[0-5]|2[0-4][0-9]|1\\d{2}|\\d{2}|\\d)\\.(25[0-5]|2[0-4][0-9]|1\\d{2}|\\d{2}|\\d)");
        Matcher matcher = ipValidator.matcher(ipAdress);
        return matcher.matches();
    }
}
