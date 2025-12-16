package math;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println(Math.sin(Math.PI));
        System.out.println(Math.log(Math.E));

        Random random = new Random(3);
        for (int i = 0; i < 20; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
        System.out.println();

        int[] arr = new int[10];
        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
}
