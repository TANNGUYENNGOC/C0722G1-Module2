package test;

import java.util.Arrays;

public class SearchQuickSort {
    public static void main(String[] args) {
        int[] array = {9, 5, 1, 8, 3, 2, 7, 6, 4, 10};
        int target = 6;

        // Sắp xếp mảng bằng quick sort
        quickSort(array, 0, array.length - 1);

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        // Tìm kiếm phần tử bằng binary search
        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Phần tử " + target + " không có trong mảng.");
        }

    }


    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
