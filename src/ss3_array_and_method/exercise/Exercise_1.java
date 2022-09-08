package ss3_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Enter colum: ");
        int colum = Integer.parseInt(sc.nextLine());
        int [][] arr = new int[row][colum];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử "+(j+1)+" của mảng "+(i));
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("Phần tử của mảng 2 chiều: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
        }
        System.out.println("max of arr is "+searchMax(arr));
    }
    static int searchMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>=max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
