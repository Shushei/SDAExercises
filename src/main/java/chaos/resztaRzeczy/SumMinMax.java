package chaos.resztaRzeczy;

import java.util.Scanner;

public class SumMinMax {
    static int min;
    static int max;
    static int sum;
    public static void main(String[] args) {
        int number;
        boolean isFirst = true;
        while((number = readNumber())!=0) {
            if(isFirst){
                isFirst = false;
                min = number;
            }
            sum+=number;
            if(min>number){
                min = number;
            }
            if(max<number){
                max = number;
            }
        }
        System.out.print("Największa = " + max +" Najmniejsza = "+min +" Suma = " + sum);
    }
    private static int readNumber(){
        boolean isNull = true;
        int numberToReturn = 0;
        Scanner scanner = new Scanner(System.in);
        while(isNull){
            System.out.println("Podaj liczbę, albo 0 żeby zakończyć program");
            isNull = false;
            try{
                numberToReturn = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException error){
                System.out.println("Podałeś złe dane");
                isNull = true;
            }
        }
        return numberToReturn;
    }
}
