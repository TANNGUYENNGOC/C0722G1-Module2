package ss7_abstrac_and_interface.practice.class_Animal_and_interface_edible;

public class  Chicken  extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Ò ó o";
    }

    @Override
    public String howToeat() {
        return "could be fried";
    }
}
