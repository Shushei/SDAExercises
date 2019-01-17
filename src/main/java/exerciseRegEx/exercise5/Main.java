package exerciseRegEx.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WWWValidator wwwValidator = new WWWValidator();
        System.out.print(wwwValidator.validate(scanner.nextLine()));
    }
}
