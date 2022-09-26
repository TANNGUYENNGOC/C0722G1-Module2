package ss15_exception_and_debug.practices.practice2;

import java.util.Scanner;

public class CalculationExample {
    private static void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x/y;
            System.out.println("tổng: "+a);
            System.out.println("hiệu: "+b);
            System.out.println("tích: "+c);
            System.out.println("thương: "+d);
        } catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập y: ");
        int y = Integer.parseInt(sc.nextLine());
        calculate(x,y);
    }
}
