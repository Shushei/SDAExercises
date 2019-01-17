package exerciseAlgorithms;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;

public class Main {
    int a;
    int b;
    int c;
    public static void main(String[] args) {
        Main main = new Main();
//        main.squareEquation();
//        main.exercise1and2();
//        main.exercise3();
//        main.quickSort();
        main.countingSort();
    }
    public void squareEquation(){
        a = Utility.readNumber();
        b = Utility.readNumber();
        c = Utility.readNumber();
        SquareEquation squareEquation = new SquareEquation(a, b, c);
        switch (squareEquation.delta()) {
            case 1:
                System.out.println("Rozwiazanie równanie to " + squareEquation.calculateDeltaZero());
                break;
            case 0:
                System.out.println("Równanie nie ma rozwiązań");
                break;
            case 2: double[] result = new double[2];
                result = squareEquation.calculateDeltaGreaterZero();
                System.out.println("Pierwsze rozwiązanie równania " + result[0]);
                System.out.println("Drugie rozwiązanie równania " + result[1]);
        }
    }public void exercise1(){
        int numberOfNumbers = 10;
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for(int i =0;i<numberOfNumbers;i++){
            listOfNumbers.add(Utility.readNumber());
        }
        Integer maxValue = Exercise1.findMax(listOfNumbers);
        Integer minValue = Exercise1.findMin(listOfNumbers);
        float arithmeticAvg = Exercise1.findArithmeticAvg(listOfNumbers);
        float goemetricAvg = Exercise1.findGeometricAvg(listOfNumbers);

        displayResult(minValue, maxValue, arithmeticAvg, goemetricAvg);
    }

    private void displayResult(Integer minValue, Integer maxValue, float arithmeticAvg, float goemetricAvg) {
        System.out.print("Min "+minValue+" Max: "+ maxValue +" Srednia Artymetyczna: "+ arithmeticAvg +" Srednia Geometryczna: "+ goemetricAvg);
    }
    public void exercise2(){
        Exercise2 exercise2 = new Exercise2();
        exercise2.main();
    }
    private void quickSort(){
        int[] listOfNumbers = Utility.generateArrayList(10,50);


        QuickSort quickSort = new QuickSort();
        quickSort.sort(listOfNumbers,0,listOfNumbers.length-1);
        Utility.printArray(listOfNumbers);
    }
    private void countingSort(){
        int[] listOfNumbers = Utility.generateArrayList(5,10);
        CountingSort countingSort = new CountingSort();
        Utility.printArray(countingSort.countingSort(listOfNumbers,10));

    }
}
