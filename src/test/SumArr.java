package test;

import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số lượng phần tử của mảng");
//        int n = sc.nextInt();
//
//        int arr[] = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Nhập phần tử thứ " +(i+1)+":");
//            arr[i] = sc.nextInt();
//        }
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println("Tổng các phần tử trong mảng là: "+sum);
        System.out.println(sumTime("11:20:30","07:35:45"));
        int decimalNumber = 142;  // Số thập phân cần chuyển đổi

        String octalNumber = Integer.toOctalString(decimalNumber);
        System.out.println("Octal number: " + octalNumber);
    }
    public static String sumTime(String time1, String time2) {
        // Phân tách chuỗi thành giờ, phút và giây
        String[] parts1 = time1.split(":");
        String[] parts2 = time2.split(":");
        int hour1 = Integer.parseInt(parts1[0]);
        int minute1 = Integer.parseInt(parts1[1]);
        int second1 = Integer.parseInt(parts1[2]);
        int hour2 = Integer.parseInt(parts2[0]);
        int minute2 = Integer.parseInt(parts2[1]);
        int second2 = Integer.parseInt(parts2[2]);

        // Tính tổng của các thành phần giờ, phút và giây
        int totalSeconds = (hour1 + hour2) * 3600 + (minute1 + minute2) * 60 + (second1 + second2);

        // Chuyển đổi tổng thời gian thành giờ, phút và giây
        int totalHours = totalSeconds / 3600;
        int totalMinutes = (totalSeconds % 3600) / 60;
        int totalSecondsRemaining = totalSeconds % 60;

        // Định dạng lại kết quả thành chuỗi "hh:MM:ss"
        String result = String.format("%02d:%02d:%02d", totalHours, totalMinutes, totalSecondsRemaining);
        return result;
    }
}
