package ss14_sort_algorithms.practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrInt = {6,4,8,1,9,2,4,3,5,7,10}; //length = 11
        sort(arrInt);
        System.out.println(Arrays.toString(arrInt));
    }
    static void sort(int arr[]) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
