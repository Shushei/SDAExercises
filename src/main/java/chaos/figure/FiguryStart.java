package chaos.figure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FiguryStart {
    static int numberOfRectangles;
    static int numberOfCircles;
    static int numberOfSquares;
    static List<Figure> figures = new ArrayList<Figure>();

    public static void main(String[] args) {

        iloscFigur();
        generateFigures();
        for (int i = 0; i < figures.size(); i++) {
            figures.get(i).displayArea();
        }
    }

    public static void iloscFigur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile prostokątów?");
        numberOfRectangles = scanner.nextInt();
        System.out.println("Ile kwadratów?");
        numberOfSquares = scanner.nextInt();
        System.out.println("Ile kół?");
        numberOfCircles = scanner.nextInt();
    }

    private static void generateFigures() {
        Random random = new Random();
        for (int i = 0; i < numberOfRectangles; i++) {
            figures.add(new Rectangle(random.nextInt(1000), random.nextInt(1000)));
        }
        for (int i = 0; i < numberOfSquares; i++) {
            figures.add(new Square(random.nextInt(1000)));
        }
        for (int i = 0; i < numberOfCircles; i++) {
            figures.add(new Circle(random.nextInt(1000)));
        }

    }

}


