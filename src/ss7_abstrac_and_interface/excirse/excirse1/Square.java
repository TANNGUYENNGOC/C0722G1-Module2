package ss7_abstrac_and_interface.excirse.excirse1;

public class Square implements Resizeable{
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
    public void resize(double percent) {
        this.edge = this.edge+this.edge*percent/100;
    }

    @Override
    public double getArea() {
        return Math.pow(this.edge,2);
    }
}
