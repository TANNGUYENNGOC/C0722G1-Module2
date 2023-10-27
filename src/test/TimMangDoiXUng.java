package test;

public class TimMangDoiXUng {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("arr1 is symmetric? " + isSymmetric(arr1));
        System.out.println("arr2 is symmetric? " + isSymmetric(arr2));
    }
    public static boolean isSymmetric(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
