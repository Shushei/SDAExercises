package chaos.resztaRzeczy;

import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {
    static int randomNumber;
    static boolean foundNumber = false;
    static int counter;

    public static void main(String[] args) {
        System.out.println("Gra się zaczyna, zgadnij liczbę wylosowną przez system");
        losujLiczbę();
        while(!foundNumber){
            guessAtempt();
        }
    }
    private static void losujLiczbę(){
        Random random = new Random();
        randomNumber = random.nextInt(101);
    }
    private static void guessAtempt(){
        counter++;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę od 0 do 100");
        int guessedNumber = scanner.nextInt();
        if(guessedNumber>randomNumber){
            System.out.println("Podana liczba jest większa od wylosowanej");
        }else if(guessedNumber< randomNumber){
            System.out.println("Podana liczba jest mniejsza od wylosowanej");
        }else{
            System.out.println("Gratuluje udało Ci się wygrać.");
            System.out.println("W " + counter + " podejściu");
            foundNumber = true;
        }
    }
}
