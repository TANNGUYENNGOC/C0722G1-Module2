package ss1_Introduction_to_Java.exercise;

import java.util.Scanner;

public class Exercise_2 {
    public static void numberToString(int input){
        String numberToString[] = {
                "zero","one","two","three","four","five","six","seven","eight","nine","ten"
        };
            System.out.println(numberToString[input]);
    }
    public static void numberToString1(int input){
        String numberToString[] = {"eleven","twelve","thirteen","three","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        System.out.println(numberToString[input-11]);
    }
    public static void numberToString2(int input1){
        String numberToString[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String numberToString1[] = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int num = input1/10;
        int num1 = input1%10;
        System.out.println(numberToString1[num-2]+" "+numberToString[num1]);
    }

    public static void numberToString3(int input1){
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String arr1[] = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        //321
        int num = input1/100;//3
        int num1 = input1%100;//21
        int num2 = num1/10; //2
        int num3 = num1%10;//1
        System.out.println(arr[num] +" hundred "+ arr1[num2-2]+ " "+arr[num3]);

    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();

        if(number>=0 && number<=10){
            numberToString(number);
        } else if (number>=11 && number <= 20){
            numberToString1(number);
        }else if(number>=21 && number<=99){
            numberToString2(number);
        }else if(number>=120 && number<=999){
            numberToString3(number);
        }

    }
}
