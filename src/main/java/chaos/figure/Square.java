package chaos.figure;

public class Square extends Figure {
    int side;
    public Square(int side){
        this.side = side;
    }

    @Override
    protected float countArea() {
        return side*side;
    }

    @Override
    public void displayArea() {
        System.out.println("Figura: Kwadra, jego pole to " + countArea());
    }
}
