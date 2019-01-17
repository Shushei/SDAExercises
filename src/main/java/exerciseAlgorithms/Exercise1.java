package exerciseAlgorithms;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise1 {
    ArrayList<Integer> listOfIntegers = new ArrayList<>();

    public static Integer findMax(ArrayList<Integer> listOfIntegers){
        int maxValue = listOfIntegers.get(0);
        for(Integer number : listOfIntegers){
            if(maxValue<number){
                maxValue = number;
            }
        }
        return maxValue;
    }

    public static Integer findMin(ArrayList<Integer> listOfIntegers){
        int minValue = listOfIntegers.get(0);
        for(Integer number : listOfIntegers){
            if(minValue>number){
                minValue = number;
            }
        }
        return minValue;
    }

    public static float findArithmeticAvg(ArrayList<Integer> listOfIntegers){
        int sum = 0;
        for(Integer number : listOfIntegers) {
            sum += number;
        }
        System.out.println(sum/listOfIntegers.size());
        return (float)sum/listOfIntegers.size();
    }
    public static float findGeometricAvg(ArrayList<Integer> listOfIntegers){
        int result = 1;
        for(Integer number : listOfIntegers){
            result *= number;
        }
        return (float)Math.pow(Math.E,  Math.log(result)/listOfIntegers.size());
    }
}
