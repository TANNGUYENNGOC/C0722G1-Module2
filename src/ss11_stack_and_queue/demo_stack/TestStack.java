package ss11_stack_and_queue.demo_stack;

import java.util.Scanner;
import java.util.Stack;


public class TestStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<>();
//        stackChuoi.push("giatri"); => đưa giá trị vào stack
//        stackChuoi.pop() => lấy giá trị ra, xóa khỏi stack
//        stackChuoi.peek() => lấy giá trị ra nhưng ko xóa khỏi stack
//        stackChuoi.clear() => xóa tất cả các phần tử trong stack
//        stackChuoi.contains("giá trị") => Xác định giá trị đó có tồn tại trong stack hay ko
//        stackChuoi.size() => độ lớn của stack
        System.out.println("Nhập vào 1 chuỗi");
        String chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            stackChuoi.push(chuoi.charAt(i)+"");
        }
        System.out.println("chuỗi đảo ngược");
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.print(stackChuoi.pop());
        }
        System.out.println();
        System.out.println(stackChuoi.size());
    }
}
