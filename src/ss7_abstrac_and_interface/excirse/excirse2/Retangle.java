package ss7_abstrac_and_interface.excirse.excirse2;

public class Retangle extends Geometric implements Colorable{
    private double width;
    private double height;

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Retangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double getArea() {
        return this.height*this.width;
    }

    @Override
    public void howToColor() {
    }
}
