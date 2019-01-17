package chaos.spoj;

import java.util.Scanner;

public class LifeUniverseAndEverything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        int[][] testSubcjects = new int[times][2];
        boolean prime;
        for (int i = 0; i < times; i++) {
            testSubcjects[i][0] = scanner.nextInt();
            testSubcjects[i][1] = scanner.nextInt();
        }
        for (int i = 0; i < times; i++) {
            for (int j =testSubcjects[i][0] ; j <= testSubcjects[i][1]; j++) {
                prime = true;
                switch (j) {
                    case 1:break;
                    case 2:
                        System.out.println(2);
                        break;
                    case 3:
                        System.out.println(3);
                        break;
                    default:
                        for (int k = 2; k <= Math.sqrt(j); k++) {
                            if (j % k == 0) {
                                prime = false;
                                break;
                            }
                        }
                        if (prime)
                            System.out.println(j);
                        break;
                }
            }
            System.out.println();
        }
    }
}
