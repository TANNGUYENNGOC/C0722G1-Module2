package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lượng số nguyên tố");
        int numbers = Integer.parseInt(sc.nextLine());

        int count;
        int n = 0;
        for (int i = 1; ; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
                n++;
            }
            if(n==numbers){
                break;
            }
        }

    }
}
