package chaos.resztaRzeczy;

import java.util.Scanner;

public class Kwadrat {
    public static void kwadrat(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość boku kwadratu.");
        int liczbaPierwsza = Integer.parseInt(scanner.nextLine());

        System.out.println("Obwód kwadratu to: " + 4*liczbaPierwsza);
        System.out.println("Pole kwadratu to: " + liczbaPierwsza*liczbaPierwsza);
    }
}
