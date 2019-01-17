package exerciseAlgorithms;


import org.junit.Assert;
import org.junit.Test;

class SortTest {

    @Test
    void sortTest() {
        int[] listOfNumbers = {1, 5, 3, 2, 7};
        int[] result = {1,2,3,5,7};
        QuickSort quickSort = new QuickSort();

        quickSort.sort(listOfNumbers,0,listOfNumbers.length-1);
        Assert.assertTrue(result == listOfNumbers);
    }
}