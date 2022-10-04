package ss19_regex;

import java.util.Scanner;

public class Excirse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^[CAP][0-9]{4}[GHIKLM]$";
        System.out.println("Nhập tên lớp: ");
        String className = sc.nextLine();
        if (className.matches(regex)){
            System.out.println("Tên lớp đúng");
        } else {
            System.out.println("tên lớp sai");
        }
    }
}
