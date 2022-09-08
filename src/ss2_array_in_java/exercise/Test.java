package ss2_array_in_java.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

    int[] arrNum = new int[]{1,2,3,4,5};
    thayDoi(arrNum);
    System.out.println(Arrays.toString(arrNum));

    int x = 10;
    thayDoi1(x);
    System.out.println(x);
    }
    static void thayDoi(int[]arr){
        arr[0] = 100;
    }
    static void thayDoi1(int n){
        n = 20;
    }
}
