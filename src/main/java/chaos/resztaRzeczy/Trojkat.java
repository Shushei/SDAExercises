package chaos.resztaRzeczy;

import java.util.Scanner;

public class Trojkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość podstawy trójkąta");
        double liczbaPierwsza = Double.parseDouble(scanner.nextLine());
        System.out.print("Podaj wysokość trójkąta");
        double liczbaDruga = Double.parseDouble(scanner.nextLine());
        double poleTrojkata =  liczbaDruga*liczbaPierwsza/2;
        System.out.print("Pole trójkąta wynosi: "+ poleTrojkata);
    }
}
