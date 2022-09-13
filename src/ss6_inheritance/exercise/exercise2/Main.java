package ss6_inheritance.exercise.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(6);
        point2D.setY(7);
        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
        System.out.println(Arrays.toString(point2D.getXY()));


        System.out.println("-----------------------");
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
        System.out.println("-----------------------");

        Point3D point3D1 = new Point3D();
        point3D1.setZ(9);
        System.out.println(Arrays.toString(point3D1.getXYZ()));
        System.out.println(point3D1);


    }
}
