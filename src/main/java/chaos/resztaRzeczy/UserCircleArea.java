package chaos.resztaRzeczy;

import java.util.Scanner;

public class UserCircleArea {
    public static void main(String[] args) {
        float radius;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj promień");

        while((radius = readRadius())<1){
            System.out.println("Podana liczba wynosi 0 lub mniej\n\r Prosze podaj liczbę dodatnią");
        }
        System.out.println(Math.PI*radius*radius);
    }
    private static float readRadius(){
        float radius = 0.0f;
        Scanner scanner = new Scanner(System.in);
        while(radius == 0.0f){
        try{
            radius = Float.parseFloat(scanner.nextLine());
        }catch (NumberFormatException error){
            System.out.println("Podaj liczbę");
        }
        }
        return radius;
    }
}
