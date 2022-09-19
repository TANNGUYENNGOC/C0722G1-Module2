package baitaplamthem2.view;

import baitaplamthem2.controller.Controller;
import baitaplamthem2.sevirce.impl.OtoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("Nhập vào lựa chọn của bạn\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát");
            System.out.println("-------------------------------------------------");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    controller.addPhuongTien();
                    break;
                case 2:
                    controller.hienThi();
                    break;
                case 3:
                    controller.xoaPhuongTien();
                    break;
                case 4:
                    controller.timKiemPhuongTienBangBienSoXe();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
