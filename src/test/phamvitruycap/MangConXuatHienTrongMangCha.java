package test.phamvitruycap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangConXuatHienTrongMangCha {
    public static void main(String[] args) {
        int arrA[] = {1, 4, 5, 3, 2, 3, 8};
        int arrB[] = {1, 2, 3};
        System.out.println(solution(arrA, arrB));
    }



    public static int solution(int[] parent, int[] child) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < child.length; i++) {
            int c = 0;
            for (int j = 0; j < parent.length; j++) {
                if (child[i] == parent[j]){
                    c++;
                }
            }
            l.add(c);
        }
        Collections.sort(l);
        return l.get(0);

    }
}
