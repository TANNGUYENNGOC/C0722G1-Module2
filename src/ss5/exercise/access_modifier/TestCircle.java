package ss5.exercise.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.5, "black");
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
    }
}
