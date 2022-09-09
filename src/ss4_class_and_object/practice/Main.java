package ss4_class_and_object.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = Integer.parseInt(sc.nextLine());
        System.out.println("Enter height: ");
        double height = Integer.parseInt(sc.nextLine());

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle: "+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+rectangle.getPerimeter());
        System.out.println("Are of the Rectangle: "+rectangle.getArea());
    }
}
