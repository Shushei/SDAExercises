package chaos.figure;

public class Rectangle extends Figure {
    int sideA;
    int sideB;
    public Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    protected float countArea(){
        System.out.print(sideA + " ");
        System.out.println(sideB);
        return sideA*sideB;
    }
    public void displayArea(){
        System.out.println("Figura: Prostokąt, pole: "+ countArea());
    }

}
