package ss7_abstrac_and_interface.excirse.excirse1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2,3);
        Square square = new Square(8);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());

        System.out.println("-------------------");
        circle.resize(20);
        System.out.println(circle.getArea());
        rectangle.resize(40);
        System.out.println(rectangle.getArea());
        square.resize(50);
        System.out.println(square.getArea());

        Resizeable[] resizeable = new Resizeable[]{circle,rectangle,square};
        for (Resizeable resizeable1: resizeable) {
            System.out.println("["+resizeable1.getArea()+"]");
        }

    }
}
