package test;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SoNguyenTo {
    public static void main(String[] args) {
        int [][] arr = {{1,2,8,43},
                {9,4,11,7},
                {11,6,4,0},
                {1,2,6,51}};
        Set<Integer> treeSet = new TreeSet<>();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(check(arr[i][j])){
                    treeSet.add(arr[i][j]);
                }
            }
        }
        int a[] = new int[treeSet.size()];
        int i = 0;
        for (Integer integer: treeSet) {
            a[i] = integer; i++;
        }
        System.out.println(Arrays.toString(a));
    }

    public static boolean check(int number){
        if (number == 1 || number == 0){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number%i==0){
                return false;
            }
        }
        return  true;
    }
}
