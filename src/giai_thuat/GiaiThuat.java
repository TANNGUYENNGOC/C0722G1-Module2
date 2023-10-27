package giai_thuat;

import java.util.Scanner;

public class GiaiThuat {
    public static void main(String[] args) {
        int[] arrNum = {0, 1, 0, 3, 12};
        solution(arrNum);
    }

    public static int[] solution(int[] nums) {
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 0) {
                for (int j = 0; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                    if(count==count2){
                        break;
                    }
                }
            }
            nums[nums.length - 1] = 0;

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return nums;
    }

}
