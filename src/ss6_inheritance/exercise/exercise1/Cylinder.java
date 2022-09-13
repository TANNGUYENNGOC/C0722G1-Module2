package ss6_inheritance.exercise.exercise1;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return super.area()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "Volume=" + volume() +
                "color=" + getColor() +
                '}';
    }
}
