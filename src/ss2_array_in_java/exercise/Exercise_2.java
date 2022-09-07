package ss2_array_in_java.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int lengthArr = Integer.parseInt(sc.nextLine());

        int[] arrInt = new int[lengthArr];
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            arrInt[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i: arrInt) {
            System.out.print(i+"\t");
        }

        System.out.println("Nhập vị trí: ");
        int index = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập phần tử: ");
        int element = Integer.parseInt(sc.nextLine());
        arrInt[index] = element;

        System.out.println("Mảng sau khi thêm: ");
        for (int i: arrInt) {
            System.out.print(i+"\t");
        }

    }
}
