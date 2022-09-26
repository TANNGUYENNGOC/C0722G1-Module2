package ss15_exception_and_debug.practices.practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Nhập chỉ số bất kì");
        int x = Integer.parseInt(sc.nextLine());
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5: "+x+"là: "+ arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
