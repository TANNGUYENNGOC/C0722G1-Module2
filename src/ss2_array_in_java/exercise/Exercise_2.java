package ss2_array_in_java.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int lengthArr = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> arrInt = new ArrayList<Integer>(lengthArr);
        int valueIndex;
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("Nhập phần tử thứ: "+i);
            valueIndex = Integer.parseInt(sc.nextLine());
            arrInt.add(valueIndex);
        }

        System.out.println("Mảng vừa nhập là: ");
        System.out.println(arrInt);

        System.out.println("Nhập phần tử cần thêm vào mảng");
        int addElement = Integer.parseInt(sc.nextLine());
        arrInt.add(addElement);

        System.out.println("MẢng sau khi thêm là: ");
        System.out.println(arrInt);

    }
}
