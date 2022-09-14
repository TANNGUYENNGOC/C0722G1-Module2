package ss7_abstrac_and_interface.excirse.excirse2;

public class Square extends Geometric implements Colorable{
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public Square() {
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    double getArea() {
        return 0;
    }
}
