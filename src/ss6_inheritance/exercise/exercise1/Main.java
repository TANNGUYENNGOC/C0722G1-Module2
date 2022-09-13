package ss6_inheritance.exercise.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5,"Blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3.5,"Green",5);
        System.out.println(cylinder);
    }
}
