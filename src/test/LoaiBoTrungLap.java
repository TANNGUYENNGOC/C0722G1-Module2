package test;

import java.util.*;

public class LoaiBoTrungLap {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5};
//        List<Integer> newArrNum = new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//            if (count(array[i],array)==1){
//                newArrNum.add(array[i]);
//            }
//        }
//
//        for (int i = 0; i < newArrNum.size(); i++) {
//            System.out.println(newArrNum.get(i));
//        }

        List<Integer> uniqueValues = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueValues.add(array[i]);
            }
        }
        System.out.println(uniqueValues);
    }

    public static int count(int n, int arrNum[]) {
        int count = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] == n) {
                count++;
            }
        }
        return count;
    }
}