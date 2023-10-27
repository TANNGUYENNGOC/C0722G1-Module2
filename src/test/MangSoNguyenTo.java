package test;

import java.util.*;

public class MangSoNguyenTo {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 8, 43},{9, 4, 11, 7},{11, 6, 4, 0},{1, 2, 6, 51}};

        System.out.println(Arrays.toString(solution(a)));

    }
    public static int[] solution(int[][] a) {
        Set<Integer> b = new TreeSet<>();
        for (int[] x : a) {
            for (int y: x) {
                if (check(y)){
                    b.add(y);
                }
            }
        }
        int [] b1 = new int[b.size()];
        int i = 0;
        for (int key: b) {
            b1[i++] = key;
        }
        return b1;
    }
    public static boolean check(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
}
