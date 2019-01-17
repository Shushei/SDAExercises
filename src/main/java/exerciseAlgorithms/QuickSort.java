package exerciseAlgorithms;

import java.util.ArrayList;

public class QuickSort {
    public void main(){

    }

    public int partition(int[] listOfNumbers, int low, int high){
        int pivot = listOfNumbers[high];
        int i = (low-1);
        for (int j = low;j<high;j++){
            if(pivot>=listOfNumbers[j]){
                i++;
                int temp = listOfNumbers[i];
                listOfNumbers[i] = listOfNumbers[j];
                listOfNumbers[j] = temp;
            }
        }
        int temp = listOfNumbers[i+1];
        listOfNumbers[i+1] = listOfNumbers[high];
        listOfNumbers[high] = temp;

        return i+1;
    }

    public void sort(int[] listOfNumbers, int low, int high){
        if(low<high){
            int pivot = partition(listOfNumbers,low,high);
            sort(listOfNumbers,low,pivot-1);
            sort(listOfNumbers,pivot+1,high);
        }
    }
}
