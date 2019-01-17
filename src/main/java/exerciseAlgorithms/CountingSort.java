package exerciseAlgorithms;

public class CountingSort {
    public int[] countingSort(int[] listOfNumbers, int range){
        int[] countArray = new int[range];
        int[] outputArray = new int[listOfNumbers.length];
        for(int i : countArray){
            i=0;
        }
        for(int i : listOfNumbers){
            countArray[i]++;
        }
//        for(int i = 1; i<countArray.length;i++){
//            countArray[i] += countArray[i-1];
//        }

//        for(int i = listOfNumbers.length-1;i>0;i--){
//            outputArray[countArray[listOfNumbers[i]-1]] = listOfNumbers[i];
//            countArray[listOfNumbers[i]]--;
//        }
        int iterator = 0;
        for (int i = 0; i<countArray.length;i++){
            for(int j = countArray[i];j>0;j--){
                outputArray[iterator] = i;
                iterator++;
            }
        }
        return outputArray;
    }
}
