package ss2_array_in_java.exercise;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng thứ 1:");
        int lengthArr1 = Integer.parseInt(sc.nextLine());

        int[] arrInt1 = new int[lengthArr1];
        for (int i = 0; i < arrInt1.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            arrInt1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i: arrInt1) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("Nhập độ dài mảng thứ 2:");
        int lengthArr2 = Integer.parseInt(sc.nextLine());

        int[] arrInt2 = new int[lengthArr2];
        for (int i = 0; i < arrInt2.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            arrInt2[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i: arrInt2) {
            System.out.print(i+"\t");
        }

        int lengthArr3 = lengthArr1 + lengthArr2;
        int[] arrInt3 = new int[lengthArr3];

        for (int i = 0; i < arrInt1.length; i++) {
            arrInt3[i] = arrInt1[i];
        }
        for (int i = 0; i < arrInt2.length; i++) {
            arrInt3[arrInt1.length+i] = arrInt2[i];
        }

        System.out.println("Phần tử mảng 3: ");
        for (int i = 0; i < arrInt3.length; i++) {
            System.out.print(arrInt3[i]+"\t");
        }
    }
}
