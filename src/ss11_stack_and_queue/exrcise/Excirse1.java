package ss11_stack_and_queue.exrcise;

import java.util.Scanner;
import java.util.Stack;

public class Excirse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> integerStack1 = new Stack<>();
        Stack<Integer> integerStack2 = new Stack<>();

        System.out.println("Nhập số phần tử của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int element = 0;

        for (int i = 1; i <= size; i++) {
            System.out.println("Nhập phần tử thứ" +i);
            element = Integer.parseInt(sc.nextLine());
            integerStack1.push(element);
            integerStack2.push(element);
        }

        //vòng for in ra mảng đảo ngược
        int length = integerStack1.size();
        System.out.println("mảng đảo ngược");
        for (int i = 0; i < length; i++) {
            System.out.println(integerStack1.pop());
        }
        for (int i = 0; i < integerStack2.size(); i++) {
            integerStack1.push(integerStack2.get(i));
        }
        System.out.println("Mảng sau khi được thêm vào lại");
        System.out.println(integerStack1);

        Stack<String> wStack = new Stack<>();
        System.out.println("Nhập vào 1 chuỗi");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            wStack.push(str.charAt(i)+"");
        }
        int lengthWStack = wStack.size();
        System.out.println("Chuỗi đảo ngược");
        for (int i = 0; i < lengthWStack; i++) {
            System.out.print(wStack.pop());
        }
    }
}
