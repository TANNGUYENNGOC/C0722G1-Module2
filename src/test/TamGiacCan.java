package test;

public class TamGiacCan {
    public static void main(String[] args) {
        int n = 5; // Số dòng của tam giác cân

        for (int i = 1; i <= n; i++) {
            // In các khoảng trắng trước khi in các ký tự '*'
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // In các ký tự '*' tạo thành tam giác cân
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
