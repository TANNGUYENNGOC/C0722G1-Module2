package test;

import java.util.HashMap;
import java.util.Map;

public class DemPhanTuTrungLap {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        Map<Integer, Integer> map = new HashMap<>();

        // Đếm số lần xuất hiện của từng số trong mảng thứ nhất
        for (int num : arr1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Kiểm tra các số trong mảng thứ hai và in ra những số trùng nhau
        System.out.println("Các số trùng nhau là:");
        for (int num : arr2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                System.out.println(num);
                map.put(num, map.get(num) - 1);
            }
        }
    }
}
