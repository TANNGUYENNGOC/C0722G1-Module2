package ss17.excirse.excirse1.controller;

import ss17.excirse.excirse1.sevirce.IProductSevirce;
import ss17.excirse.excirse1.sevirce.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductSevirce iProductSevirce = new ProductService();
    public static void menuProduct() {
        while (true) {
            System.out.println("Chương trình quản lý sản phẩm");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iProductSevirce.addProduct();
                    break;
                case 2:
                    iProductSevirce.displayProduct();
                    break;
                case 3:
                    iProductSevirce.searchProduct();
                    break;
                case 4:
                    return;
            }
        }
    }
}
