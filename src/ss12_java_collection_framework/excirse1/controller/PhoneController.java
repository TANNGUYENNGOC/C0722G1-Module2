package ss12_java_collection_framework.excirse1.controller;

import ss12_java_collection_framework.excirse1.service.IPhoneService;
import ss12_java_collection_framework.excirse1.service.impl.PhoneService;

import java.util.Scanner;

public class PhoneController {
    public static void menuPhone(){
        IPhoneService iPhoneService = new PhoneService();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Nhập lựa chọn của bạn:\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm theo id\n" +
                    "3. Xoá sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần theo giá\n"+
                    "7. Sắp xếp sản phẩm giảm dần theo giá\n"+
                    "8. Thoát");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    iPhoneService.addPhone();
                    break;
                case 2:
                    iPhoneService.updatePhone();
                    break;
                case 3:
                    iPhoneService.removePhone();
                    break;
                case 4:
                    iPhoneService.displayAllPhone();
                    break;
                case 5:
                    iPhoneService.searchPhone();
                    break;
                case 6:
                    iPhoneService.sortUpAscending();
                    break;
                case 7:
                    iPhoneService.sortDecreasing();
                    break;
                case 8:
                    return;
            }
        } while (true);
    }
}
