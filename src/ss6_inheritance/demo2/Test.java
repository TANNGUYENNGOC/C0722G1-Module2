package ss6_inheritance.demo2;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        BabyDog bbd = new BabyDog();
        bbd. eat();
        bbd.bark();
        bbd.weep();

        Cat cat = new Cat("Chó"); //đối tượng tên chó nhưng thực chất nó là con mèo
        System.out.println(cat.getName());
        cat.eat();

        Bird b = new Bird();
        System.out.println(b.getName());
        b.eat();
        b.fly();


    }


}
