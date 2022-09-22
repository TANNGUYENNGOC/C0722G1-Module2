package ss13_search_algorithm.excirse;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Excirse1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = str.nextLine();

        LinkedList<Character> max = new LinkedList<>();


        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();

            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.addAll(list);
            }
//            list.clear();
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
