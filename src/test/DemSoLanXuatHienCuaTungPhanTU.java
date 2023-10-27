package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DemSoLanXuatHienCuaTungPhanTU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int a = sc.nextInt();
        int result = 0;
        while (a != 0) {
            int temp = a % 10;
            result = result * 10 + temp;
            a = a / 10;
        }
        System.out.println(result);
    }

}
