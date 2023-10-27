package test.oca7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputString = "abcbdcef";
        char[] result = solution(inputString);
        System.out.println("Cac ky tu xuat hien nhieu hon 1 lan trong chuoi: ");
        for (char ch : result) {
            System.out.print(ch + " ");
        }
    }

    public static char[] solution(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Đếm số lần xuất hiện của từng ký tự trong chuỗi
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Lọc các ký tự có số lần xuất hiện lớn hơn 1
        List<Character> resultChars = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            if (charCountMap.get(ch) > 1 && !resultChars.contains(ch)) {
                resultChars.add(ch);
            }
        }

        // Chuyển kết quả về dạng mảng ký tự
        char[] resultArray = new char[resultChars.size()];
        for (int i = 0; i < resultChars.size(); i++) {
            resultArray[i] = resultChars.get(i);
        }

        return resultArray;
    }
}
