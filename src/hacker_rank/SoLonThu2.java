package hacker_rank;

import java.util.*;

public class SoLonThu2 {
    public static String solve(String input) {
        String [] strings = input.split(" ");
        if (strings.length==1){
            char [] c = input.toCharArray();
            if (Character.isLowerCase(c[0])) {
                String rs = ""+ Character.toUpperCase(c[0]);


                for (int i = 1; i < c.length; i++) {
                    rs+=c[i];
                }
                return rs;
            }
        }
        StringBuilder modifiedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (i > 0 && Character.isUpperCase(currentChar)) {
                modifiedString.append(' ');
            }
            modifiedString.append(Character.toLowerCase(currentChar));
        }
        return modifiedString.toString();
    }

    public static void main(String[] args) {
        String input = "DaNang"; // Thay đổi chuỗi đầu vào ở đây
        String modifiedOutput = solve(input);
        System.out.println("Chuỗi sau khi sửa: " + modifiedOutput);
    }
}
