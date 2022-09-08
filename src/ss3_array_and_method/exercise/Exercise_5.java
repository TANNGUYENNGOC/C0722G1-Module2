package ss3_array_and_method.exercise;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = sc.nextLine();

        System.out.println("Nhập vào kí tự cần đếm");
        char characters = sc.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==characters){
                count++;
            }
        }
        System.out.println("Có "+count+" kí tự" +characters+" xuất hiện trong chuỗi");

    }
}
