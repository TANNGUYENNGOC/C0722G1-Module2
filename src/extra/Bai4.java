package extra;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhập a: ");

        a = Double.parseDouble(scanner.next());
        System.out.println("Nhập b: ");
        b = Double.parseDouble(scanner.next());
        System.out.println("Nhập b: ");
        c = Double.parseDouble(scanner.next());
        double deTal = (b * b) - (4 * a * c);
        if (checkDetal(a, b, c) == false) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            ketQua(deTal, a, b, c);
        }
    }

    public static boolean checkDetal(double a, double b, double c) {
        double deTal = (b * b) - (4 * a * c);
        if (deTal < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void ketQua(double deTal, double a, double b, double c) {
        if (deTal > 0) {
            double x1 = ((-b + Math.sqrt(deTal)) / (2 * a));
            double x2 = ((-b - Math.sqrt(deTal)) / (2 * a));
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }
        if (deTal == 0) {
            double x = -b / (2 * a);
            System.out.println("x1 = x2 = " + x);
        }
    }
}
