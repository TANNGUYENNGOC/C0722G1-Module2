package case_study.services.impl;

import case_study.models.personModel.Employee;
import case_study.services.IEmployeeService;
import case_study.utils.read_file.ReadFileEmployeeUtils;
import case_study.utils.write_file.WriteFileEmployeeUtils;

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
//    static ArrayList<String> listLevel = new ArrayList<>(Arrays.asList("Lễ tân", "phục vụ", "chuyên viên", "giám sát", "quản lý", "giám đốc"));

    @Override
    public void displayList() {
        employeeList = ReadFileEmployeeUtils.readFileEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addElement() {
        employeeList = ReadFileEmployeeUtils.readFileEmployee();
        employeeList.add(infoEmployee());
        WriteFileEmployeeUtils.writeFileEmployee(employeeList);
        System.out.println("successfully added new (Thêm mới thành công)");

    }

    @Override
    public void editInfoEmployee() {
        employeeList = ReadFileEmployeeUtils.readFileEmployee();

        System.out.println("enter the ID to edit (Nhập ID để chỉnh sửa): ");
        String iD = sc.nextLine();
        int choose;
        boolean flagEdit = false;
        String name;
        LocalDate birthday;
//        String gender;
//        String numberCMND;
        String numberPhone;
        String email;
//        String level;
        String position;
        double wage;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getiD().equals(iD)) {
                flagEdit = true;
                //==============
                edtInfo:
                do {
                    while (true){
                        try {
                            System.out.println("What information do you want to edit? (Bạn muốn chỉnh sửa thông tin nào)\n" +
                                    "1.Name\n2.Birthday\n3.Gender\n4.numberCMND\n5.NumberPhone\n6.Email\n7.Level\n8.Position\n9.Wage");

                            choose = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException e){
                            System.out.println("re-enter");
                        }

                    }

                    switch (choose) {
                        case 1:
                            System.out.println("Enter name: ");
                            name = sc.nextLine();
                            employeeList.get(i).setName(name);
                            break edtInfo;
                        case 2:
                         while (true){
                             try {
                                 System.out.println("Enter Birthday: ");
                                 birthday = LocalDate.parse(sc.nextLine(), timeFormatter);
                                 employeeList.get(i).setBirthday(birthday);
                                 break edtInfo;
                             } catch (DateTimeException e){
                                 System.out.println("The date must match the format dd/MM/yyyy\n" +
                                         "(Ngày tháng năm phải đúng với định dạng dd/MM/YYYY)");
                             }
                         }


                        case 3:
//                            System.out.println("Enter gender: ");
//                            gender = sc.nextLine();
//                            employeeList.get(i).setGender(gender);
                            String genderEmployee = "";
                            while (true) {
                                System.out.println("Gender of employee enter (Male/Female/LGBT) \n" +
                                        " (Nhập giới tính của nhân viên");
                                genderEmployee = sc.nextLine();
                                if (genderEmployee.equals("Male") || genderEmployee.equals("Female") || genderEmployee.equals("LGBT")) {
                                    employeeList.get(i).setGender(genderEmployee);
                                    break;
                                }else {
                                    System.out.println("re-enter gender");
                                }
                            }
                            break edtInfo;
                        case 4:

                            String numberCMNDEmployee;
                            while (true){
                                System.out.println("CMND of employee enter (Nhập số CMND của nhân viên): ");
                                numberCMNDEmployee = sc.nextLine();

                                if (!numberCMNDEmployee.matches("[0-9]{9}")){
                                    System.out.println("ID number must have 9 digits\n" +
                                            "Số CMND phải có 9 chữ số");
                                } else {
                                    employeeList.get(i).setNumberCMND(numberCMNDEmployee);
                                    break;
                                }
                            }
                            break edtInfo;
                        case 5:
                            do {
                                System.out.println("Number phone of employee (Nhập số điện thoại của nhân viên): ");
                                numberPhone = sc.nextLine();
                                if(!(numberPhone.matches("0[0-9]{9}"))){
                                    System.out.println("Phone number must have 10 digits and start with 0\n" +
                                            "Số điện thoại phải có 10 số và bắt đầu bằng 0");
                                }
                                else {
                                    employeeList.get(i).setNumberPhone(numberPhone);
                                    break;
                                }
                            }while (true);
                            break edtInfo;
                        case 6:
                            do {
                                System.out.println("Email of employee (Nhập email của nhân viên): ");
                                email = sc.nextLine();
                                if(!email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")){
                                    System.out.println("Wrong email format (Email sai định dạng)");
                                }else {
                                    employeeList.get(i).setEmail(email);
                                    break;
                                }
                            } while (true);
                            break edtInfo;
                        case 7:
//                            System.out.println("Enter level");
//                            level = sc.nextLine();
//                            employeeList.get(i).setLevel(level);
                            int choose1;
                            String levelEmployee = "";
                            NYC:
                            do {
                                while (true){
                                    try {
                                        System.out.println("1.Intermediate\n" +
                                                "2. College\n" +
                                                "3. Undergraduate\n" +
                                                "4. Graduate");
                                        System.out.println("Level of employee enter");
                                        choose1 = Integer.parseInt(sc.nextLine());
                                        break;
                                    } catch (NumberFormatException e){
                                        System.out.println("re-enter");
                                    }
                                }

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
                            employeeList.get(i).setLevel(levelEmployee);
                            break edtInfo;
                        case 8:
//                            System.out.println("Enter Position");
//                            position = sc.nextLine();
                            int choose2;
                            String positionEmployee = "";
                            NYC1:
                            do {
                                do {
                                    try {
                                        System.out.println("Position of employee choose (chọn chức vụ):\n" +
                                                "1. Receptionist (lễ tân)\n" +
                                                "2. Service (phục vụ)\n" +
                                                "3. Expert (chuyên viên)\n" +
                                                "4. Supervisory (giám sát)\n" +
                                                "5. Manager (quản lý)\n" +
                                                "6. President (giám đốc)\n");
                                        choose2 = Integer.parseInt(sc.nextLine());
                                        break;
                                    }catch (NumberFormatException e){
                                        System.out.println("Please choose 1 of 6 options (Vui lòng chọn 1 trong 6 lựa chọn)");
                                    }
                                } while (true);
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
                            employeeList.get(i).setPosition(positionEmployee);
                            break edtInfo;
                        case 9:
                            while (true){
                                try {
                                    System.out.println("Enter wage");
                                    wage = Double.parseDouble(sc.nextLine());
                                    break;
                                }catch (NumberFormatException e){
                                    System.out.println("re-enter wage");
                                }
                            }

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
        WriteFileEmployeeUtils.writeFileEmployee(employeeList);
    }

    public static Employee infoEmployee() {
        String iDEmployee;
        do {
            System.out.println("ID employee enter (Nhập mã nhân viên):");
            iDEmployee = sc.nextLine();
            if(!iDEmployee.matches("NV[0-9]{3}"))//mã nhân viên là NV001
            {
                System.out.println("false format, Please re-enter the correct format (ex: NV001)\n" +
                        "Sai định dạng, vui lòng nhập đúng định dạng (vd: NV001)");
            } else {
                break;
            }
        }while (true);

        //========================================

        System.out.println("Name of employee enter (Nhập tên nhân viên)");
        String nameEmployee = sc.nextLine();
        //===========================
        LocalDate birthdayEmployee = getLocalDate();
        //==========================
        String genderEmployee = "";
        while (true) {
            System.out.println("Gender of employee enter (Male/Female/LGBT) \n" +
                    " (Nhập giới tính của nhân viên");
            genderEmployee = sc.nextLine();
            if ((genderEmployee.equals("Male")) || (genderEmployee.equals("Female")) || (genderEmployee.equals("LGBT"))){
                break;

            }else {
                System.out.println("re-enter gender");

            }
        }
        //==========================
        String numberCMNDEmployee;
        while (true){
            System.out.println("CMND of employee enter (Nhập số CMND của nhân viên): ");
             numberCMNDEmployee = sc.nextLine();
             if (!(numberCMNDEmployee.matches("[0-9]{9}"))){
                 System.out.println("ID number must have 9 digits\n" +
                         "Số CMND phải có 9 chữ số");
             } else {
                 break;
             }
        }

        //==========================
        String numberPhone;
        do {
            System.out.println("Number phone of employee (Nhập số điện thoại của nhân viên): ");
            numberPhone = sc.nextLine();
            if(!numberPhone.matches("0[0-9]{9}")){
                System.out.println("Phone number must have 10 digits and start with 0\n" +
                        "Số điện thoại phải có 10 số và bắt đầu bằng 0");
            }
            else {
                break;
            }
        }while (true);

        //==========================
        String emailEmployee;
        do {
            System.out.println("Email of employee (Nhập email của nhân viên): ");
             emailEmployee = sc.nextLine();
            if(!emailEmployee.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")){
                System.out.println("Wrong email format (Email sai định dạng)");
            }else {
                break;
            }
        } while (true);

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
            do {
                System.out.println("Position of employee choose (chọn chức vụ):\n" +
                        "1. Receptionist (lễ tân)\n" +
                        "2. Service (phục vụ)\n" +
                        "3. Expert (chuyên viên)\n" +
                        "4. Supervisory (giám sát)\n" +
                        "5. Manager (quản lý)\n" +
                        "6. President (giám đốc)\n");
                try {
                    choose2 = Integer.parseInt(sc.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Please choose 1 of 6 options (Vui lòng chọn 1 trong 6 lựa chọn)");
                }
            } while (true);
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
    public static String getInfoEmployee(Employee employee){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",employee.getiD(),employee.getName(),employee.getBirthday(),employee.getGender(),employee.getNumberCMND(),employee.getNumberPhone(),employee.getEmail(),employee.getLevel(),employee.getPosition(),employee.getWage());
    }


}
