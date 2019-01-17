package exercise12012019.bubbleSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] toSort= new int[10];
        Random random = new Random();

        for (int i =0; i<toSort.length;i++){
            toSort[i]= random.nextInt(10);
        }


        int[] sorted = BubbleSort.sort(toSort);
        for(int i =0; i<sorted.length;i++){
            System.out.print(sorted[i] +" ");
        }
    }
}
