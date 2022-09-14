package ss7_abstrac_and_interface.excirse.excirse2;

public class Circle extends Geometric implements Colorable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    double getArea() {
        return Math.pow(this.radius,2);
    }

    @Override
    public void howToColor() {
    }
}
