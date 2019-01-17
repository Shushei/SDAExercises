package chaos.rownanieKwadratowe;

import java.util.Scanner;

public class RownanieKwadratoweMain {
    static int a;
    static int b;
    static int c;
    public static void main(String[] args) {
        a = readNumber();
        b = readNumber();
        c = readNumber();
        SquareEquation squareEquation = new SquareEquation(a, b, c);
        switch (squareEquation.delta()) {
            case 1:
                System.out.println("Rozwiazanie równanie to " + squareEquation.calculateDeltaZero());
                break;
            case 0:
                System.out.println("Równanie nie ma rozwiązań");
                break;
            case 2: double[] result = new double[2];
            result = squareEquation.calculateDeltaGreaterZero();
                System.out.println("Pierwsze rozwiązanie równania " + result[0]);
                System.out.println("Drugie rozwiązanie równania " + result[1]);
        }
    }
        private static int readNumber () {
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
    }
