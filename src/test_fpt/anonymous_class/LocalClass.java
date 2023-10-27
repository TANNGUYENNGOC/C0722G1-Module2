package test_fpt.anonymous_class;

abstract class Person {
    abstract void eat();
}

public class LocalClass {
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            void eat() {
                System.out.println("Ăn cơm");
            }
        };
        Person p2 = new Person() {
            @Override
            void eat() {
                System.out.println("Ăn bánh");
            }
        };
        p.eat();
        p2.eat();
    }
}
