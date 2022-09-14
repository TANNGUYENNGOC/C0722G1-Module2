package ss7_abstrac_and_interface.excirse.excirse2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(4);
        Retangle retangle = new Retangle(4,5);
        Geometric[] geometrics = new Geometric[]{circle,square,retangle};

        for (Geometric geometric: geometrics) {
            if(geometric.equals(square)){
                square.howToColor();
            } else {
                System.out.println(geometric.getArea());
            }
        }
    }
}
