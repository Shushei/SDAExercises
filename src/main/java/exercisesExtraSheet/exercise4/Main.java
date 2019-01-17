//Napisz program który będzie symulować pracę biletomatu
package exercisesExtraSheet.exercise4;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
    public void start(){
        System.out.println("Witamy w naszym biletomacie. Każdy bilet kosztuje 4 zł, ile biletów chcesz kupić?");
        int ticketCount = scanner.nextInt();
        System.out.println("Proszę dokonaj zapłaty");
        int paidMoney = scanner.nextInt();
        int[] theRest = exchangeCalucation(paidMoney-(ticketCount*4));
    }
    public int[] exchangeCalucation(int theRest){
        int[] theCalculatedRest = new int[8];
        int i =0;
        System.out.print("Suma reszty: (");
        for(Nominals nominal : Nominals.values()){
            theCalculatedRest[i] = theRest / nominal.getNumVal();
            theRest = theRest - (theCalculatedRest[i]*nominal.getNumVal());
            System.out.print(theCalculatedRest[i]*nominal.getNumVal());
            i++;
            if(i<8){
                System.out.print(" + ");
            }

        }
        System.out.print(") PLN");

        return theCalculatedRest;
    }

}
