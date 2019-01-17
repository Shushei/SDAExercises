package chaos.resztaRzeczy;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz F jeśli chcesz wymienic farenheita na celcius.");
        System.out.println("Przy jakiemkolwiek innym wyrazniu wymienisz celciusza na farenheita");
        String opcjaWyboru = scanner.nextLine();
        System.out.print("Podaj temperaturę");
        int temperatura = Integer.parseInt(scanner.nextLine());
        if (opcjaWyboru.equals("F")){
            System.out.print(temperatura+" stopni farenheita to "+ farenheitToCelcius(temperatura)+ " stopnia celciusza");
        }else{
            System.out.print(temperatura+" stopni celciusza to "+ celciusToFarenheit(temperatura)+ " stopnia farenheita");
        }
    }
    private static int celciusToFarenheit(int celcius){
        return celcius*9/5+32;
    }
    private static int farenheitToCelcius(int farenheit){
        return (farenheit-32)*5/9;
    }
}
