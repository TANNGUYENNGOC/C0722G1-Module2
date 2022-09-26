package ss15_exception_and_debug.excirse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập cạnh b:");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập cạnh c: ");
        double c = Double.parseDouble(sc.nextLine());
        checkTriangle(a,b,c);
    }
    public static void checkTriangle (double a, double b, double c){
        try {
            if (a < 0) {
                throw new IllegalTriangleException("a < 0");

            } if (b < 0) {
                throw new IllegalTriangleException("b < 0");
            } if(c<0) {
                throw new IllegalTriangleException("c < 0");
            }
            if (a + b < c) {
                throw new IllegalTriangleException("a+b nhỏ hơn c");
            } else if (a + c < b) {
                throw new IllegalTriangleException("a+c nhỏ hơn b");
            } else if (b + c < a) {
                throw new IllegalTriangleException("b+c nhỏ hơn a");
            }

        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }

    }
}
