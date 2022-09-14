package ss7_abstrac_and_interface.excirse.excirse1;

public class Circle implements Resizeable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
//        this.radius = this.radius+(percent*this.radius);
//        setRadius(this.radius+percent/100);
        this.radius = this.radius+this.radius*percent/100;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }
}
