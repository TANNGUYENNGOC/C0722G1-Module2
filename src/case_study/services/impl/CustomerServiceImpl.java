package case_study.services.impl;

import case_study.models.personModel.Customer;
import case_study.services.ICustomerService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static Scanner sc = new Scanner(System.in);
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static List<Customer> customerList = new LinkedList<>();

    @Override
    public void editCustomer() {
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
        String customerType;
        String address;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getiD().equals(iD)) {
                flagEdit = true;
                //==============
                edtInfo:
                do {
                    System.out.println("What information do you want to edit? (Bạn muốn chỉnh sửa thông tin nào)\n" +
                            "1.Name\n2.Birthday\n3.Gender\n4.numberCMND\n5.NumberPhone\n6.Email\n7.Customer Type\n8.Address");
                    choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.println("Enter name: ");
                            name = sc.nextLine();
                            customerList.get(i).setName(name);
                            break edtInfo;
                        case 2:
                            System.out.println("Enter Birthday: ");
                            birthday = LocalDate.parse(sc.nextLine(), timeFormatter);
                            customerList.get(i).setBirthday(birthday);
                            break edtInfo;
                        case 3:
                            System.out.println("Enter gender: ");
                            gender = sc.nextLine();
                            customerList.get(i).setGender(gender);
                            break edtInfo;
                        case 4:
                            System.out.println("Enter CMND");
                            numberCMND = sc.nextLine();
                            customerList.get(i).setNumberCMND(numberCMND);
                            break edtInfo;
                        case 5:
                            System.out.println("Enter Number Phone");
                            numberPhone = sc.nextLine();
                            customerList.get(i).setNumberPhone(numberPhone);
                            break edtInfo;
                        case 6:
                            System.out.println("Enter email");
                            email = sc.nextLine();
                            customerList.get(i).setEmail(email);
                            break edtInfo;
                        case 7:
                            System.out.println("Enter customer type");
                            customerType = sc.nextLine();
                            break edtInfo;
                        case 8:
                            System.out.println("Enter address type");
                            address = sc.nextLine();
                            break edtInfo;
                    }
                } while (true);
                break;
            }
        }
        if (!flagEdit) {
            System.out.println("iD not found to edit (không tìm thấy ID cần chỉnh sửa)");
        }

    }

    @Override
    public void displayList() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addElement() {
        customerList.add(infoCustomer());
        System.out.println("successfully added new (Thêm mới thành công)");
    }

    public static Customer infoCustomer() {
        System.out.println("ID customer enter (Nhập mã khách hàng):");
        String iDCustomer = sc.nextLine();
        //=======================================

        System.out.println("Name customer enter (Nhập tên khách hàng)");
        String nameCustomer = sc.nextLine();
        //=======================================


        System.out.println("BirthDay customer enter (Nhập ngày sinh của khách hàng)");
        LocalDate birthdayCustomer = LocalDate.parse(sc.nextLine(), timeFormatter);
        //=======================================

        System.out.println("Gender customer enter (Nhập giới tính khách hàng)");
        String gender = sc.nextLine();
        //=======================================

        System.out.println("Number CMND customer enter (Nhập số CMND của khách hàng)");
        String numberCMND = sc.nextLine();
        //=======================================

        System.out.println("Number phone customer enter (Nhập số điện thoại của khách hàng)");
        String numberPhone = sc.nextLine();
        //=======================================

        System.out.println("Email of customer enter (Nhập email của khách hàng");
        String emailCustomer = sc.nextLine();
        //=======================================

        System.out.println("Customer type enter (Loại khách hàng)");
        String customerType = sc.nextLine();
        //=======================================

        System.out.println("Address of customer enter (Nhập địa chỉ của khách hàng)");
        String addressCustomer = sc.nextLine();
        //=======================================


        Customer customer = new Customer(iDCustomer, nameCustomer, birthdayCustomer, gender, numberCMND, numberPhone, emailCustomer, customerType, addressCustomer);
        return customer;
    }
}
