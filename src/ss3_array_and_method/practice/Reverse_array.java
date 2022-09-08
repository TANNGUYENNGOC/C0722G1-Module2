package ss3_array_and_method.practice;

import java.util.Arrays;
import java.util.Scanner;


public class Reverse_array {
    public static void main(String[] args) {
        //Khai báo các biến
        int size;
        int []arr;
        Scanner sc = new Scanner(System.in);

        //Nhập và kiểm tra kích thước của mảng
        do {
            System.out.println("Enter size: ");
            size = Integer.parseInt(sc.nextLine());
            if(size > 20){
                System.out.println("size does not exceed 20");
            }
        } while (size > 20);

        //Nhập giá trị của từng phần tử cho mảng
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ "+i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        //Hiển thị mảng vừa nhập
        System.out.println("mảng vừa nhập");
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[arr.length-1-j];
            arr[arr.length-1-j] = temp;
        }
        System.out.println("mảng sau khi đảo");
        System.out.println(Arrays.toString(arr));

    }
}
