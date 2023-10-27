package test.java7and8;

import java.util.Optional;

public class OptionalClazz {
    public static void main(String[] args) {
        // Java 7
//        String name = getName();
//        if (name != null) {
//            System.out.println("Name: " + name);
//        } else {
//            System.out.println("Name not available");
//        }

// Java 8
        Optional<String> optionalName = Optional.ofNullable(getName());
        optionalName.ifPresent(
                n -> System.out.println("Name: " + n)
        );
        optionalName.orElseGet(() -> {
            System.out.println("Name not available");
            return "Default Name";
        });
    }
    public static String getName(){
        return "zzzzzzz";
    }
}
