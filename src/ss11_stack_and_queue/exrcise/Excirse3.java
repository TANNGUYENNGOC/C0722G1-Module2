package ss11_stack_and_queue.exrcise;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Excirse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String str = sc.nextLine();
        Stack<String> stringStack = new Stack<>();
        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            stringStack.push(str.charAt(i)+"");
            stringArrayDeque.add(str.charAt(i)+"");
        }
        int length2Arr = stringStack.size();
        int count = 0;
        for (int i = 0; i < length2Arr; i++) {
            if (stringStack.pop().equals(stringArrayDeque.remove())){
                count++;
            }
        }
        if(count == length2Arr){
            System.out.println("Đây là chuỗi palindrome");
        } else {
            System.out.println("Đây là không phải chuỗi palindrome");
        }
    }
}
