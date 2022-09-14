package ss7_abstrac_and_interface.excirse.excirse1;

public class Rectangle implements Resizeable{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void resize(double percent) {
        this.height = this.height+this.height*percent/100;
        this.width = this.width+this.width*percent/100;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }
}
