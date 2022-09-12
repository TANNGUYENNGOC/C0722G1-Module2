package ss5_access_modifier_and_static.exercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return 2*this.radius*Math.PI;
    }
}
