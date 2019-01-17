package exerciseRegEx.exercise1and2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TelephoneValidator telephoneValidator = new TelephoneValidator();
        System.out.print(telephoneValidator.validate(scanner.nextLine()));

    }
}
