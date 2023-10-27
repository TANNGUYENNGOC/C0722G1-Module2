package ss1_Introduction_to_Java.exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_1 {
    public static Map<Character, Integer> getCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        Map<Character, Integer> frequencyMap = getCharacterFrequency(input);

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
//    //Kiểm tra số đó có phải là số nguyên tố hay không
//    public static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    // trả về giá trị tổng các số nguyên tố
//    public static int sumOfPrimes(int n) {
//        int sum = 0;
//
//        for (int i = 2; i <= n; i++) {
//            if (isPrime(i)) {
//                sum += i;
//            }
//        }
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int n = 100;
//        int sum = sumOfPrimes(n);
//        System.out.println("Sum of primes up to " + n + " is: " + sum);
//    }
}