package exerciseRegEx.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NameValidator nameValidator = new NameValidator();
        System.out.print(nameValidator.validate(scanner.nextLine()));
    }
}
