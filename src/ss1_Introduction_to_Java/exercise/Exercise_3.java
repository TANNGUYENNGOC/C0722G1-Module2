package ss1_Introduction_to_Java.exercise;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD: ");
        int usd = sc.nextInt();
        int rate = usd*23000;
        System.out.println(usd+ " USD = "+rate+" VND");
    }
}
