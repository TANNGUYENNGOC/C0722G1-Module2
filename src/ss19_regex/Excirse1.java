package ss19_regex;

import java.util.Scanner;

public class Excirse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại");
        String sdt = sc.nextLine();
        if(sdt.matches("0[0-9]*")){
            System.out.println("Số điện thoại đúng định dạng");
        } else {
            System.out.println("Số điện thoại sai định dạng");
        }
    }
}
