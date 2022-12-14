package baitaplamthem1.controller;

import baitaplamthem1.service.IStudentService;
import baitaplamthem1.service.impl.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuStudent() throws IOException {
        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Chào mừng bạn đến với chương trình quản lý CodeGym");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiển thị danh sách học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Tìm kiếm theo tên học sinh");
            System.out.println("5. Tìm kiếm theo mã học sinh");
            System.out.println("6. Hiển thị danh sách đã được sắp xếp theo ID");
            System.out.println("7. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.displayAllStudent();
                    break;
                case 3:
                    iStudentService.removeStudent();
                    break;
                case 4:
                    iStudentService.searchNameStudent();
                    break;
                case 5:
                    iStudentService.searchIDStudent();
                    break;
                case 6:
                    iStudentService.sortStudent();
                    break;
                case 7:
//                    System.exit(0);
//                  break;
                    return;
            }
        }
    }
}
