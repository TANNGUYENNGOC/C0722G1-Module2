package ss1_Introduction_to_Java.practice;

import java.util.Scanner;

public class Operator_Expression {
    //Biểu thức toán tử
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        //Tính diện tích hình chữ nhật và hiển thị ra màng hình
        float area = width*height;
        System.out.println("Area is: "+area);
    }
}
