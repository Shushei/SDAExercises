package ExercisesExtraSheet.exercise2;

import java.util.Scanner;

public class FirstNumbers {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number greater than 2");
        number = scanner.nextInt();
        switch (number) {
            case 1:
            case 2: {
                System.out.println("2");
                break;
            }
            case 3: {
                System.out.println("3");
                break;
            }
            default: {
                System.out.println(firstNumberCalucation(number));
            }

        }

    }

    public static int firstNumberCalucation(int number) {
        int numberMinus = number;
        boolean foundFirstNumber = false;
        boolean foundFirstNumberMinus = false;
        while (!foundFirstNumber && !foundFirstNumberMinus) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if ((number % i) == 0) {
                    number++;
                    foundFirstNumber = false;
                    break;
                } else {
                    foundFirstNumber = true;
                }
            }
            for (int i = 2; i <= Math.sqrt(numberMinus); i++) {
                if ((numberMinus % i) == 0) {
                    numberMinus--;
                    foundFirstNumberMinus = false;
                    break;
                } else {
                    foundFirstNumberMinus = true;
                }
            }

        }
        if(foundFirstNumber){
            return number;
        }
            return numberMinus;

    }
}
