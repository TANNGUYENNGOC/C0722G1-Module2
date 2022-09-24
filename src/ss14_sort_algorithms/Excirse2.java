package ss14_sort_algorithms;

import java.util.Arrays;

public class Excirse2 {
    public static void main(String[] args) {
        int[] arrInt = new int[]{5, 3, 4, 1, 8, 9, 3, 2, 6, 7, 3, 4};
        System.out.println(Arrays.toString(insertionSort(arrInt)));
    }

    static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int curElement = list[i];
            int j = i - 1;
            for (; j >= 0 && list[j] >= curElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = curElement;
        }
        return list;
    }
}
