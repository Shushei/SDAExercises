package chaos.shape;

public class Circle {
    final static int UNIT = 1;
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public static Circle makeCircleOne(){
        return new Circle(Circle.UNIT);
    }
}
