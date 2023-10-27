package extra;

import java.util.HashMap;
import java.util.Map;

public class Bai1 {
    public static void main(String[] args) {
//        Bài 1. Đếm số lần xuất hiện các ký tự trong chuỗi.
        String chu = "asdfs1e1ebvxvx";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <chu.length() ; i++) {
            map.put(chu.charAt(i), map.getOrDefault(chu.charAt(i), 0) + 1);
        }
        System.out.println(map);
    }
}
