package chaos.shape;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,5);
        Rectangle square = Rectangle.makeSquare(3);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(square.count);
    }
}
