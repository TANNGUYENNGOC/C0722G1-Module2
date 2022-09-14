package ss6_inheritance.exercise.exercise3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint.getX());
        System.out.println(movablePoint.getY());
        System.out.println(movablePoint.getXSpeed());
        System.out.println(movablePoint.getYSpeed());
        System.out.println(Arrays.toString(movablePoint.getSpeed()));
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
        System.out.println("--------------------");
        movablePoint.setXSpeed(6);
        movablePoint.setYSpeed(7);
//      movablePoint.setSpeed(7,8);
        System.out.println(movablePoint.move());

        System.out.println("----------------------");

        Point point = new Point(8,9);
        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point);

    }
}
