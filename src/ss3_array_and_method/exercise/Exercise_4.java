package ss3_array_and_method.exercise;

import java.util.Scanner;

public class Exercise_4 {
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
            System.out.println();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
           sum = arr[i][i] +sum;
        }

        int sum1=0;
        int k = 0;
        for (int i = arr.length-1; i >=0; i--) {
                    sum1 = sum1 +arr[i][k];
                    k++;
        }

        System.out.println("sum 1: "+sum);
        System.out.println("sum 2: "+sum1);
        System.out.println("sum1 + sum2 = "+(sum1+sum));
    }
}
