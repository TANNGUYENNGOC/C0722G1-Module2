package ss13_search_algorithm.practice;

import java.util.Scanner;

public class Search_Not_Recursive {
    /*
    Tìm kiếm nhị phân
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("Nhập phần tử cần tìm kiếm");
        int key = Integer.parseInt(sc.nextLine());
        if(binarySearch(list,key) == -1){
            System.out.println("không tìm thấy "+key+" trong mảng");
        }else {
            System.out.println(key+" tồn tại ở vị trí "+binarySearch(list,key));
        }
    }
//    static int binarySearch(int[] list,int key){
//        int left = 0;
//        int right = list.length - 1;
//
//        while (left < right){
//            int mid = (right + left) / 2;
//            if(key == list[mid]){
//                return mid;
//            }
//            if(key > mid){
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return -1;
//    }


    static int binarySearch(int[] list, int key){
        int left = 0;
        int right = list.length - 1;
        while (right >= left) {
            int mid = (right + left) / 2;
            //Kiểm tra key có ở giữa ko
            if (key == list[mid]){
                return mid;
            }
            //Nếu key lớn hơn thì bỏ qua nửa bên trái của mảng
            else if(key > list[mid]){
                left = mid + 1;
            }
            //nếu key nhỏ hơn thì bỏ qua nửa bên phải
            else{
                right = mid - 1;
            }
        }
        //Phần tử ko tồn tại
        return  -1;
    }
}
