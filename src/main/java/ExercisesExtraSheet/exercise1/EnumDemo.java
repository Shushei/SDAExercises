package ExercisesExtraSheet.exercise1;

import java.util.Scanner;

public class EnumDemo {
    public static void main(String[] args) {
        int liczba;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number from 1 to 20");
        liczba = scanner.nextInt();
        System.out.println("The number you wrote is " + Numbers.values()[liczba-1]);
    }

}
