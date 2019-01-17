package exerciseAlgorithms;

public class Exercise2 {
    public void main(){
        int a = Utility.readNumber();
        int b = Utility.readNumber();
        int c = Utility.readNumber();
        a = a*a;
        b = b*b;
        c = c*c;
        if(a == b+c || b == a+c || c == a+b){
            System.out.print("Gratuluje, zbuydowałeś trójkąt");
        }else{
            System.out.print("Nie da się zbudować trójkąta");
        }

    }
}
