package chaos.resztaRzeczy;

import java.util.Scanner;

public class Mathematics {
    public static void matematyka(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę");
        int liczbaPierwsza = Integer.parseInt(scanner.nextLine());
        System.out.print("Podaj drugą liczbę");
        int liczbaDruga = Integer.parseInt(scanner.nextLine());

        System.out.println("Suma "+ dodawanie(liczbaPierwsza,liczbaDruga));
        System.out.println("Różnica "+ odejmowanie(liczbaPierwsza,liczbaDruga));
        System.out.println("Wynik mnożenia "+ mnożenie(liczbaPierwsza,liczbaDruga));
        System.out.println("Wynik dzielenia "+ dzielenie(liczbaPierwsza,liczbaDruga));
    }

    private static int dodawanie(int liczbaPierwsza, int liczbaDruga) {
        return liczbaDruga + liczbaPierwsza;
    }
    private static int mnożenie(int liczbaPierwsza, int liczbaDruga) {
        return liczbaPierwsza * liczbaDruga;
    }
    private static int odejmowanie(int liczbaPierwsza, int liczbaDruga)  {
        return liczbaPierwsza - liczbaDruga;
    }
    private static int dzielenie(int liczbaPierwsza, int liczbaDruga) {
        return liczbaPierwsza / liczbaDruga;
    }
}
