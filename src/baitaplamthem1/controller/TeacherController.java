package baitaplamthem1.controller;


import baitaplamthem1.service.ITeacherService;
import baitaplamthem1.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static ITeacherService iTeacherService = new TeacherService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuTeacher() {
        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Chào mừng bạn đến với chương trình quản lý CodeGym");
            System.out.println("1. Thêm mới giáo viên");
            System.out.println("2. Hiển thị danh sách giáo viên");
            System.out.println("3. Xóa giáo viên");
            System.out.println("4. Tìm kiếm theo mã giáo viên");
            System.out.println("5. Tìm kiếm theo tên giáo viên");
            System.out.println("6. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.displayTeacher();
                    break;
                case 3:
                    iTeacherService.removeTeacher();
                    break;
                case 4:
                    iTeacherService.searchIDTeacher();
                    break;
                case 5:
                    iTeacherService.searchNameTeacher();
                    break;
                case 6:
//                    System.exit(0);
//                    break;
                    return;
            }
        }
    }

}
