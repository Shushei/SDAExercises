package ExercisesExtraSheet.exercise5;

import lombok.extern.log4j.Log4j;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start(){
        Pattern aproval = Pattern.compile("[0-9+\\-*^()\\./]{3,}");
        Matcher matcher;
        String toCalculate;
        do {
            System.out.println("Podaj wyrażenie np (4+5), (5-4), (5*5), (5/5), (5^2), ((5-4)+(4*5))");

        }while(!aproval.matcher((toCalculate = scanner.nextLine())).matches());
        System.out.println("Podałeś poprawny zwrot");
        calculate(toCalculate);
    }
    public void calculate(String toCalculate){
        for(int i = 0; i<toCalculate.length(); i++){
            char c = toCalculate.charAt(i);
            int d = toCalculate.length();
            if((i > 0 && toCalculate.charAt(i-1) != ')') && (i<toCalculate.length()-1 && toCalculate.charAt(i+1) != '(') &&(c == '+'|| c =='-' || c =='*' || c =='/' || c =='^')){
                toCalculate = calculate(i,toCalculate);
                i=0;
            }
        }
        System.out.println(toCalculate);
    }
    public String calculate(int i, String toCalculate){
        double a;
        double b;
        int k = i-1;
        String result ="";
        while(k>=0 && !(toCalculate.charAt(k) == '('|| toCalculate.charAt(k) == '/'|| toCalculate.charAt(k) == '*'|| toCalculate.charAt(k)== '-'|| toCalculate.charAt(k) == '+'|| toCalculate.charAt(k) == '^')){
            k--;
        }
        a = Double.parseDouble(toCalculate.substring(k+1,i));
        if(k>0) {
            result += toCalculate.substring(0, k);
        }
        k  = i+1;
        while(k<toCalculate.length() && !(toCalculate.charAt(k) == ')'|| toCalculate.charAt(k) == '/'|| toCalculate.charAt(k) == '*'|| toCalculate.charAt(k)== '-'|| toCalculate.charAt(k) == '+'|| toCalculate.charAt(k) == '^')){
            k++;
        }
        b = Double.parseDouble(toCalculate.substring(i+1,k));

        switch(toCalculate.charAt(i)){
            case '+':{
                result += Double.toString(Calculator.add(a,b));
                break;
            }
            case '-':{
                result += Double.toString(Calculator.substract(a,b));
                break;
            }
            case '*':{
                result += Double.toString(Calculator.multiply(a,b));
                break;
            }
            case '/':{
                result += Double.toString(Calculator.divide(a,b));
                break;
            }
            case '^':{
                result += Double.toString(Calculator.power(a,b));
                break;
            }
        }
        if(k<toCalculate.length() && toCalculate.charAt(k) == ')'){
            result += toCalculate.substring(k+1, toCalculate.length());
        } else{
            result += toCalculate.substring(k, toCalculate.length());
        }
        return result;
    }

}
