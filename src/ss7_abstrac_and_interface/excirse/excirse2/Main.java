package ss7_abstrac_and_interface.excirse.excirse2;

public class Main {
    public static void main(String[] args) {
        Geometric circle = new Circle(3);
        System.out.println(circle.getArea());
        Geometric square = new Square(4);
        Geometric square1 = new Square(4);
        Geometric retangle = new Retangle(4,5);
        Geometric[] geometrics = new Geometric[]{circle,square,retangle,square1};

        for (Geometric geometric: geometrics) {
            if(geometric instanceof Square){
                ((Square)geometric).howToColor();
            } else {
                System.out.println(geometric.getArea());
            }

        }
    }
}
