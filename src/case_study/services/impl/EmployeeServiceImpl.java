package case_study.services.impl;

import case_study.models.personModel.Employee;
import case_study.services.IEmployeeService;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static Scanner sc = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static ArrayList<String> listLevel = new ArrayList<>(Arrays.asList("Lễ tân", "phục vụ", "chuyên viên", "giám sát", "quản lý", "giám đốc"));

    @Override
    public void displayList() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addElement() {
        employeeList.add(infoEmployee());
        System.out.println("successfully added new (Thêm mới thành công)");
    }

    @Override
    public void editInfoEmployee() {
        System.out.println("enter the ID to edit (Nhập ID để chỉnh sửa): ");
        String iD = sc.nextLine();
        int choose;
        boolean flagEdit = false;
        String name;
        LocalDate birthday;
        String gender;
        String numberCMND;
        String numberPhone;
        String email;
        String level;
        String position;
        double wage;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getiD().equals(iD)) {
                flagEdit = true;
                //==============
                edtInfo:
                do {
                    System.out.println("What information do you want to edit? (Bạn muốn chỉnh sửa thông tin nào)\n" +
                            "1.Name\n2.Birthday\n3.Gender\n4.numberCMND\n5.NumberPhone\n6.Email\n7.Level\n8.Position\n9.Wage");
                    choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.println("Enter name: ");
                            name = sc.nextLine();
                            employeeList.get(i).setName(name);
                            break edtInfo;
                        case 2:
                            System.out.println("Enter Birthday: ");
                            birthday = LocalDate.parse(sc.nextLine(), timeFormatter);
                            employeeList.get(i).setBirthday(birthday);
                            break edtInfo;
                        case 3:
                            System.out.println("Enter gender: ");
                            gender = sc.nextLine();
                            employeeList.get(i).setGender(gender);
                            break edtInfo;
                        case 4:
                            System.out.println("Enter CMND");
                            numberCMND = sc.nextLine();
                            employeeList.get(i).setNumberCMND(numberCMND);
                            break edtInfo;
                        case 5:
                            System.out.println("Enter Number Phone");
                            numberPhone = sc.nextLine();
                            employeeList.get(i).setNumberPhone(numberPhone);
                            break edtInfo;
                        case 6:
                            System.out.println("Enter email");
                            email = sc.nextLine();
                            employeeList.get(i).setEmail(email);
                            break edtInfo;
                        case 7:
                            System.out.println("Enter level");
                            level = sc.nextLine();
                            employeeList.get(i).setLevel(level);
                            break edtInfo;
                        case 8:
                            System.out.println("Enter Position");
                            position = sc.nextLine();
                            employeeList.get(i).setPosition(position);
                            break edtInfo;
                        case 9:
                            System.out.println("Enter wage");
                            wage = Double.parseDouble(sc.nextLine());
                            employeeList.get(i).setWage(wage);
                            break edtInfo;
                    }
                } while (true);
                //==============
                break;
            }

        }
        if (!flagEdit) {
            System.out.println("iD not found to edit (không tìm thấy ID cần chỉnh sửa)");
        }
    }

    public static Employee infoEmployee() {
        System.out.println("ID employee enter (Nhập mã nhân viên):");
        String iDEmployee = sc.nextLine();
        //========================================

        System.out.println("Name of employee enter (Nhập tên nhân viên)");
        String nameEmployee = sc.nextLine();
        //===========================
        LocalDate birthdayEmployee = getLocalDate();
        //==========================
        String genderEmployee = "";
        while (!genderEmployee.equals("Male") && !genderEmployee.equals("Female") && !genderEmployee.equals("LGBT")) {
            System.out.println("Gender of employee enter (Male/Female/LGBT) \n" +
                    " (Nhập giới tính của nhân viên");
            genderEmployee = sc.nextLine();
            if (genderEmployee.equals("Male") || genderEmployee.equals("Female") || genderEmployee.equals("LGBT")) {
                System.out.println("re-enter gender");
            }
        }
        //==========================

        System.out.println("CMND of employee enter (Nhập số CMND của nhân viên): ");
        String numberCMNDEmployee = sc.nextLine();
        //==========================

        System.out.println("Number phone of employee (Nhập số điện thoại của nhân viên): ");
        String numberPhone = sc.nextLine();
        //==========================

        System.out.println("Email of employee (Nhập email của nhân viên): ");
        String emailEmployee = sc.nextLine();
        //==========================

        int choose1;
        String levelEmployee = "";
        NYC:
        do {
            System.out.println("1.Intermediate\n" +
                    "2. College\n" +
                    "3. Undergraduate\n" +
                    "4. Graduate");
            System.out.println("Level of employee enter");
            choose1 = Integer.parseInt(sc.nextLine());
            switch (choose1) {
                case 1:
                    levelEmployee = "Intermediate";
                    break NYC;
                case 2:
                    levelEmployee = "College";
                    break NYC;
                case 3:
                    levelEmployee = "Undergraduate";
                    break NYC;
                case 4:
                    levelEmployee = "Graduate";
                    break NYC;
            }

        } while (true);
        //==========================

        int choose2;
        String positionEmployee = "";
        NYC1:
        do {
            System.out.println("Position of employee choose (chọn chức vụ):\n" +
                    "1. Receptionist (lễ tân)\n" +
                    "2. Service (phục vụ)\n" +
                    "3. Expert (chuyên viên)\n" +
                    "4. Supervisory (giám sát)\n" +
                    "5. Manager (quản lý)\n" +
                    "6. President (giám đốc)\n");

            choose2 = Integer.parseInt(sc.nextLine());
            switch (choose2) {
                case 1:
                    positionEmployee = "Receptionist";
                    break NYC1;
                case 2:
                    positionEmployee = "Service";
                    break NYC1;
                case 3:
                    positionEmployee = "Expert";
                    break NYC1;
                case 4:
                    positionEmployee = "Supervisory";
                    break NYC1;
                case 5:
                    positionEmployee = "Manager";
                    break NYC1;
                case 6:
                    positionEmployee = "President";
                    break NYC1;
                default:
                    System.out.println("Please choose 1 of 6 options (vui lòng chọn 1 trong 6)");
                    break;
            }
        }
        while (true);
        double wageEmployee;

        while (true) {
            try {
                System.out.println("Wage of Employee enter (Nhập lương của nhân viên)");
                wageEmployee = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please re-enter your salary\n" +
                        "Vui lòng nhập lại mức lương của bạn");
            }
        }
        Employee employee = new Employee(iDEmployee, nameEmployee, birthdayEmployee, genderEmployee, numberCMNDEmployee, numberPhone, emailEmployee, levelEmployee, positionEmployee, wageEmployee);
        return employee;
    }

    private static LocalDate getLocalDate() {
        LocalDate birthdayEmployee;
        while (true) {
            try {
                System.out.println("Birth of employee enter (Nhập ngày sinh của nhân viên)");
                birthdayEmployee = LocalDate.parse(sc.nextLine(), timeFormatter);
                break;
            } catch (DateTimeException e) {
                System.out.println("Please re-enter the correct format dd/MM/yyyy (Vui lòng nhập lại đúng định dạng dd/MM/yyyy)");
            }
        }
        return birthdayEmployee;
    }


}
