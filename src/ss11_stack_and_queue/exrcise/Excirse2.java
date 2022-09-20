package ss11_stack_and_queue.exrcise;

import java.util.Scanner;
import java.util.Stack;

public class Excirse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình chuyển từ thập phân sang nhị phân");
        System.out.println("Nhập vào 1 số ở hệ thập phân");
        int number = Integer.parseInt(sc.nextLine());
        Stack<String> str = new Stack<>();
        int soDu;
        while (number>0){
            soDu = number%2;
            str.push(soDu+"");
            number = number/2;
        }
        System.out.println("Số nhị phân là: ");
        int length = str.size();
        for (int i = 0; i < length; i++) {
            System.out.print(str.pop());
        }
    }
}