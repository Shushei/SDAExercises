package chaos.figure;

public class Circle extends Figure {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    protected float countArea() {
        return (float) Math.PI * (radius * radius);
    }

    @Override
    public void displayArea() {
        System.out.println("Figura: Koło, jego pole wynosi: " + countArea());
    }
}
