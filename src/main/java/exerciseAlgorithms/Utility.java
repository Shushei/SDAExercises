package exerciseAlgorithms;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Utility {
    public static int readNumber () {
        boolean isNull = true;
        int numberToReturn = 0;
        Scanner scanner = new Scanner(System.in);
        while (isNull) {
            System.out.println("Podaj liczbę");
            isNull = false;
            try {
                numberToReturn = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException error) {
                System.out.println("Podałeś złe dane");
                isNull = true;
            }
        }
        return numberToReturn;
    }
    public static int[] generateArrayList(int size, int max){
        Random random = new Random();
        int[]listOfNumbers = new int[size];
        for (int i=0;i<size;i++){
            listOfNumbers[i]= random.nextInt(max);
        }
        return listOfNumbers;
    }
    public static void printArray(int[] array){
        for(int i = 0; i< array.length;i++){
            System.out.print(array[i] +" ");
        }
    }
}
