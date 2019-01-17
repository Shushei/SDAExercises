package chaos.resztaRzeczy;

import java.util.Scanner;

public class Parzysta {
    public static void czyParzysta(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę do sprawdzenia");
        int liczbaPierwsza = Integer.parseInt(scanner.nextLine());
        if(liczbaPierwsza%2==0){
            System.out.print("Liczba jest parzysta");
        }
        else {
            System.out.print("Liczba jest nieparzysta");
        }
    }
}
