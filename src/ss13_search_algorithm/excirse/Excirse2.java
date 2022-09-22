package ss13_search_algorithm.excirse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Excirse2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhập độ dài mảng
        System.out.println("Nhập độ dài của mảng: ");
        int lengthArr = Integer.parseInt(sc.nextLine());

        int[] arrInt = new int[lengthArr];
        //Nhập phần tử cho mảng
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + ":");
            arrInt[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng sau khi được sắp xếp");
        System.out.println(Arrays.toString(sortASC(arrInt)));

        System.out.println("Nhập phần tử cần tìm: ");
        int searchEnter = Integer.parseInt(sc.nextLine());
        System.out.println("giá trị: "+searchEnter+" ở vị trí: "+binarySearch(arrInt,searchEnter,arrInt[0],arrInt[arrInt.length-1]));


    }
    static int[] sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    static int binarySearch(int[]arr, int k, int left, int right){
        if(right > left){
            int mid = (left + right)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(k<arr[mid]){
                return binarySearch(arr, k, left, mid-1);
            }
            return binarySearch(arr, k, mid+1,right);
        }
        return -1;
    }

}
