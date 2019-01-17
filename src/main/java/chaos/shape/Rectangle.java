package chaos.shape;

public class Rectangle {
    static int count;
    int width;
    int height;
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
        count++;
    }
    public static Rectangle makeSquare(int side){
        return new Rectangle(side,side);
    }
    public int getPerimeter(){
        return 2*height + 2*width;
    }
    public int getArea(){
        return height*width;
    }
    public String toString(){
        return width+" "+ height;
    }
}
