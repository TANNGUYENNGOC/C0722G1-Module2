package test;

import java.util.*;

public class DemSoLanXuatHienKiTu {
    public static void main(String[] args) {
//        String input = "mmmaaabbza";
//        System.out.println(Arrays.deepToString(solution(input)));
        int[] arrA = {1, 2, 3, 4,6,9};
        int[] arrB = {2, 3, 4, 5};

        for (int i = 0; i < arrA.length; i++) {
            if(check(arrA[i],arrB)){
                System.out.println(arrA[i] +" không tồn tại trong B");
            }
        }
    }

    public static boolean check(int a, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                count = count + 1;
            }
        }
        if (count > 0) {
            return false;
        }
        return true;
    }

    public static String[][] solution(String s) {

        String[] arr = s.split("");
        Map<String, Integer> stringIntegerMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            stringIntegerMap.put(arr[i], 0);
        }

        for (String key : stringIntegerMap.keySet()) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(key)) {
                    stringIntegerMap.put(key, stringIntegerMap.get(key) + 1);
                }
            }
        }
        String[][] arrString = new String[stringIntegerMap.size()][2];
        List<String> list = new ArrayList<>();
        for (String key : stringIntegerMap.keySet()) {
            list.add(stringIntegerMap.get(key).toString());
            list.add(key);
        }
        int k = 0;
        for (int i = 0; i < arrString.length; i++) {
            for (int j = 0; j < arrString[i].length; j++) {
                arrString[i][j] = list.get(k);
                k++;
            }
        }
        return arrString;
    }
}
