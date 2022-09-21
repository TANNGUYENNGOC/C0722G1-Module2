package ss11_stack_and_queue.exrcise;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Excirse4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biểu thức");
        String str = sc.nextLine();
        System.out.println(check(str));
    }
    public static boolean check(String str ){
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='('){
                bStack.push(str.charAt(i));
            } else if(str.charAt(i)==')'){
                if(bStack.isEmpty()){
                    return false;
                }else {
                    bStack.pop();
                }
            }
        }
        if(bStack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

}

