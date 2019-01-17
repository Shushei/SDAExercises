package chaos.shape;

import java.util.Scanner;

public class CreateShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width;
        int heigth;
        System.out.println("Podaj wysokość");
        if (scanner.hasNextInt()) {
            heigth = scanner.nextInt();
        } else {
            return;
        }
        System.out.println("Podaj długość");
        if (scanner.hasNextInt()) {

            width = scanner.nextInt();
            if (width <= 0 || heigth<=0){
                System.out.println("Bok nie może być mniejszy lub równy 0");
                return;
            }
            Rectangle rectangle = new Rectangle(heigth, width);
            System.out.println("Obwów : " + rectangle.getPerimeter());
            System.out.println("Pole : " + rectangle.getArea());
        } else {
            return;
        }


    }
}
