package chaos.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\b\\w+\\b\\s+b.*",
                Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher("może  być");
        System.out.println(matcher.matches());
        Pattern kodPocztowy = Pattern.compile(".*ala.*");
        Matcher kodPocztowyMatcher = kodPocztowy.matcher(scanner.nextLine());
        if(kodPocztowyMatcher.matches()){
            System.out.println("jest ala");
        } else{
            System.out.println("Nie ma ala");
        }

    }
}

