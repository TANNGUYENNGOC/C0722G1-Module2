package ss7_abstrac_and_interface.practice.class_Animal_and_interface_edible;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());

        }
    }
}
