package test.java7and8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPI {
    public static void main(String[] args) {
        // Java 7
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> squaredNumbers = new ArrayList<>();
//        for (Integer number : numbers) {
//            squaredNumbers.add(number * number);
//        }
//        System.out.println(squaredNumbers);

// Java 8
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);
    }
}
