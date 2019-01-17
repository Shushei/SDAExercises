package chaos.resztaRzeczy;

import java.util.Scanner;

public class SredniaArytmetyczna {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int suma = 0;
        String daneWejsciowe;

        System.out.print("Podaj pierwszą liczbę lub wpisz Koniec");
        while (!((daneWejsciowe = scanner.nextLine()).equals("Koniec"))) {
            counter++;
            suma += Integer.parseInt(daneWejsciowe);
            System.out.print("Podaj kolejną liczbę, żeby zakończyć podawanie liczb wpisz Koniec");
        }

        if (counter > 0) {
            System.out.print(suma / counter);
        } else {
            System.out.print("Nie podałeś żadnej liczby");
        }


    }
}
