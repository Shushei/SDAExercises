package exercise12012019.bubbleSort;

public class BubbleSort {
    public static int[] sort(int[] toSort){
        boolean sorted = false;
        int placeHolder;
        while(!sorted){
            sorted = true;
            for(int i=0;i<toSort.length-1;i++){
                if(toSort[i] > toSort[i+1]){
                    placeHolder = toSort[i];
                    toSort[i] = toSort[i+1];
                    toSort[i+1] = placeHolder;
                    sorted = false;
                }
            }
        }
        return toSort;
    }
}
