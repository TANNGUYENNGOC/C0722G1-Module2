package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Print the rectangle\n" +
                "\n" +
                "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "\n" +
                "3.Print isosceles triangle\n" +
                "\n" +
                "4.Exit");
        int input = Integer.parseInt(sc.nextLine());
        while (input<=0 || input > 4){
            System.out.println("Retype: ");
            input = Integer.parseInt(sc.nextLine());
        }
        switch (input){
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i=1; i<=5; i++){
                    for(int j=1; j<i; j++){
                        System.out.print("*");
                    }

                    System.out.println();
                }
                System.out.println("------------------------------------");
                for(int i=1; i<=5; i++){
                    for (int j = 5; j >= i ; j--) {
                        System.out.print(" ");
                    }
                    for(int j=1; j<i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("------------------------------------");
                for(int i=7;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println("------------------------------------");
                for (int i = 1; i <=7 ; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 7; j >= i ; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                break;
            case 3:
                System.out.println("Enter height");
                int height = Integer.parseInt(sc.nextLine());
                int left = height;
                int right = height;
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <2*height-1 ; j++) {
                        if(j>=left && j<=right){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    left--;
                    right++;
                    System.out.println();
                }

                break;
            case 4:
                System.out.println("Đã thoát");
                break;
        }

    }
}
