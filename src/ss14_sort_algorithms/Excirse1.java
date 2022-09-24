package ss14_sort_algorithms;

import java.util.Arrays;

public class Excirse1 {
    public static void main(String[] args) {
        int[] arrInt = new int[]{5, 3, 4, 1, 8, 9, 3, 2, 6, 7, 3, 4};
        insertionSort(arrInt);
        System.out.println(Arrays.toString(arrInt));
    }

    static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            System.out.println(i);
            int curElement = list[i];
            int j = i - 1;
            for (; j >= 0 && list[j] >= curElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = curElement;
        }
    }
}
