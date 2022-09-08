package ss3_array_and_method.exercise;

public class Exercise_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,-11};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min of arr is "+min);
    }
}
