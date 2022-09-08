package ss3_array_and_method.exercise;

import java.util.Scanner;

public class Exercise_3 {
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

        System.out.println("Nhập cột muốn tính tổng các phần tử trong cột đó");
        int numCol = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                    sum = sum + arr[i][numCol];
        }

        System.out.println("sum is: "+sum);
    }
}
