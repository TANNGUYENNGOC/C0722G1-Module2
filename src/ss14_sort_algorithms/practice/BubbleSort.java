package ss14_sort_algorithms.practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrInt = {6,4,8,1,9,2,4,3,5,7,10}; //length = 11
        int swap;
//        for (int i = 0; i < arrInt.length-1; i++) {
//            for (int j = 0; j<arrInt.length-i-1 ; j++) {
//                if(arrInt[j]>arrInt[j+1]){
//                    swap = arrInt[j];
//                    arrInt[j]=arrInt[j+1];
//                    arrInt[j+1] =swap;
//                }
//            }
//        }
        for (int i = 0; i < arrInt.length-1; i++) {
            for (int j = 0; j < arrInt.length-i-1; j++) {
                if(arrInt[j]>arrInt[j+1]){
                    swap = arrInt[j];
                    arrInt[j] = arrInt[j+1];
                    arrInt[j+1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(arrInt));
    }
}
