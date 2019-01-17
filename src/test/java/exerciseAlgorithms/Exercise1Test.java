package exerciseAlgorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


class Exercise1Test {

    @Test
    void findMax() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for(int i =0; i<100;i++){
            listOfNumbers.add(i);
        }
        float result = Exercise1.findMax(listOfNumbers);
        Assert.assertTrue(result == 99f);
    }

    @Test
    void findMin() {
    }

    @Test
    void findArithmeticAvg() {
    }

    @Test
    void findGeometricAvg() {
    }
}