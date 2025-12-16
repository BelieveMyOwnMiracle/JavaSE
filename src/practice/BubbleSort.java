package practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 2, 9, 0, 6, 1, 8, 4};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        int[] dest = new int[arr.length];
        System.arraycopy(arr, 0, dest, 0, arr.length);
        int temp;
        for (int i = 0; i < dest.length; i++) {
            for (int j = 0; j < dest.length - i - 1; j++) {
                if (dest[j] > dest[j + 1]) {
                    temp = dest[j];
                    dest[j] = dest[j + 1];
                    dest[j + 1] = temp;
                }
            }
        }
        return dest;
    }
}
