package chaos.rownanieKwadratowe;

public class SquareEquation {
    int a;
    int b;
    int c;
    SquareEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int delta(){
        if((b*b - (4*a*c)>0)){
            return 2;
        }
        if((b*b - (4*a*c)==0)){
            return 1;
        }
        return 0;
    }
    public double calculateDeltaZero(){
        double result = (-b)/(2d*a);
        return result;

    }
    public double[] calculateDeltaGreaterZero() {
        double[] result = new double[2];
        result[0] = (-b-Math.sqrt((b*b)-(4d*a*c)))/(2d*a);
        result[1] = (-b+Math.sqrt((b*b)-(4d*a*c)))/(2d*a);
        return result;
    }
}
