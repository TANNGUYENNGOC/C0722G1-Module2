package baitaplamthem1.view;

import baitaplamthem1.controller.StudentController;
import baitaplamthem1.controller.TeacherController;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1. Menu học sinh");
            System.out.println("2. Menu giáo viên");
            System.out.println("3. Thoát");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    StudentController.menuStudent();
                    break;
                case 2:
                    TeacherController.menuTeacher();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
