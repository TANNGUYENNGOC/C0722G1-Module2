package ss2_array_in_java.exercise;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        //Nhập phần tử cho mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int lengthOfArr = Integer.parseInt(sc.nextLine());

        int[] arrNumbers = new int[lengthOfArr];
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            arrNumbers[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Element of arr");
        for (int i : arrNumbers) {
            System.out.print(i + "\t");
        }
        System.out.println();


        //Xóa phần tử của mảng
//         int[] arr = new int[] {3,2,1,6,9,8};
        System.out.println("enter the element to be deleted: ");
        int deleteElement = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arrNumbers.length; i++) {
            if(arrNumbers[i]==deleteElement){
                for (int j = i; j < arrNumbers.length-1; j++) {
                    arrNumbers[j] = arrNumbers[j+1];
                }
                arrNumbers[arrNumbers.length-1] = 0;
                i--;
            }

        }
        System.out.println("Element of new arr");
        for (int i : arrNumbers) {
            System.out.print(i + "\t");
        }


    }
}
