package ss5_access_modifier_and_static.practice.static_property;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        Car.setNumberOfCars(5);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
        System.out.println(car2.getNumberOfCars());
//        System.out.println(Car.getNumberOfCars());

    }
}
