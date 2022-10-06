package case_study.services.impl;

import case_study.models.personModel.Customer;
import case_study.models.personModel.Employee;
import case_study.services.ICustomerService;
import case_study.utils.read_file.ReadFileCustomerUtils;
import case_study.utils.write_file.WriteFileCustomerUtils;

import java.time.DateTimeException;
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
        customerList = ReadFileCustomerUtils.readFileCustomer();
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
                    while (true) {
                        try {
                            choose = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("re-enter");
                        }

                    }
                    switch (choose) {
                        case 1:
                            System.out.println("Enter name: ");
                            name = sc.nextLine();
                            customerList.get(i).setName(name);
                            break edtInfo;
                        case 2:
                            while (true) {
                                try {
                                    System.out.println("Enter Birthday: ");
                                    birthday = LocalDate.parse(sc.nextLine(), timeFormatter);
                                    break;
                                } catch (DateTimeException e) {
                                    System.out.println("re-enter format (dd/MM/yyyy)");
                                }
                            }
                            customerList.get(i).setBirthday(birthday);
                            break edtInfo;


                        case 3:
                            while (true){
                            System.out.println("Enter gender Male/Female/LGBT: ");
                            gender = sc.nextLine();
                                if((gender.equals("Male")) || (gender.equals("Female")) || (gender.equals("LGBT"))){
                                    break;
                                } else {
                                    System.out.println("re-enter gender");
                                }
                        }
                            customerList.get(i).setGender(gender);
                            break edtInfo;

                        case 4:
                             while (true){
                                 System.out.println("Enter CMND (9 or 12 number and 0-9)");
                                 numberCMND = sc.nextLine();
                                if ((numberCMND.matches("[0-9]{9}")) || (numberCMND.matches("[0-9]{12}"))){
                                    break ;
                                } else {
                                    System.out.println("re-enter CMND");
                                }
                        }

                            customerList.get(i).setNumberCMND(numberCMND);
                            break edtInfo;
                        case 5:
                            while (true) {
                                System.out.println("Enter Number Phone");
                                numberPhone = sc.nextLine();
                                if (numberPhone.matches("0[0-9]{9}")) {
                                    break;
                                } else {
                                    System.out.println("Re-enter number phone (0XXXXXXXXXX)");
                                }
                            }
                            customerList.get(i).setNumberPhone(numberPhone);
                            break edtInfo;
                        case 6:
                            while (true) {
                                System.out.println("Enter email");
                                email = sc.nextLine();
                                if (email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                                    break;
                                } else {
                                    System.out.println("Re-enter email");
                                }
                            }
                            customerList.get(i).setEmail(email);
                            break edtInfo;
                        case 7:
                            int chooseYour;
                            do {
                                while (true) {
                                    try {
                                        System.out.println("Enter customer type\n" +
                                                "1. Diamond\n2. Platinium\n3. Gold\n4. Silver\n5. Member");
                                        chooseYour = Integer.parseInt(sc.nextLine());
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("re-enter");
                                    }
                                }
                                switch (chooseYour) {
                                    case 1:
                                        customerType = "Diamond";
                                        customerList.get(i).setCustomerType(customerType);
                                        break edtInfo;
                                    case 2:
                                        customerType = "Platinium";
                                        customerList.get(i).setCustomerType(customerType);
                                        break edtInfo;
                                    case 3:
                                        customerType = "Gold";
                                        customerList.get(i).setCustomerType(customerType);
                                        break edtInfo;
                                    case 4:
                                        customerType = "Silver";
                                        customerList.get(i).setCustomerType(customerType);
                                        break edtInfo;
                                    case 5:
                                        customerType = "Member";
                                        customerList.get(i).setCustomerType(customerType);
                                        break edtInfo;
                                }
                            }while (true);

//                            break edtInfo;
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
        WriteFileCustomerUtils.writeFileCustomer(customerList);
    }

    @Override
    public void displayList() {
        customerList = ReadFileCustomerUtils.readFileCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addElement() {
        customerList = ReadFileCustomerUtils.readFileCustomer();
        customerList.add(infoCustomer());
        WriteFileCustomerUtils.writeFileCustomer(customerList);
        System.out.println("successfully added new (Thêm mới thành công)");
    }

    public static Customer infoCustomer() {
        String iDCustomer;
        while (true) {
            System.out.println("ID customer enter (Nhập mã khách hàng):");
            iDCustomer = sc.nextLine();
            if (!(iDCustomer.matches("KH[0-9]{3}"))) {
                System.out.println("Please enter the correct format (ex: KH001)\n" +
                        "Vui lòng nhập đúng định dạng (vd: KH001)");
            } else {
                break;
            }
        }
        //=======================================

        System.out.println("Name customer enter (Nhập tên khách hàng)");
        String nameCustomer = sc.nextLine();
        //=======================================
        LocalDate birthdayCustomer;
        while (true) {
            try {
                System.out.println("BirthDay customer enter (Nhập ngày sinh của khách hàng)");
                birthdayCustomer = LocalDate.parse(sc.nextLine(), timeFormatter);
                break;
            } catch (DateTimeException e) {
                System.out.println("re-enter (dd/MM/YYYY");
            }
        }

        //=======================================
        String gender = "";
        while (true) {
            System.out.println("Gender customer enter Male/Female/LGBT (Nhập giới tính khách hàng)");
            gender = sc.nextLine();
            if(!(gender.equals("Male")) || !(gender.equals("Female")) || !(gender.equals("LGBT"))){
                System.out.println("re-enter gender");

            } else {
                break;

            }
        }
        //=======================================
        String numberCMND;
        while (true) {
            System.out.println("Number CMND customer enter (Nhập số CMND của khách hàng)");
            numberCMND = sc.nextLine();
            if ((numberCMND.matches("[0-9]{9}") || (numberCMND.matches("[0-9]{12}")))) {
                break;
            } else {
                System.out.println("You have entered the wrong CMND number");
            }

        }
        //=======================================
        String numberPhone;
        while (true) {
            System.out.println("Number phone customer enter (Nhập số điện thoại của khách hàng)");
            numberPhone = sc.nextLine();
            if (!(numberPhone.matches("0[0-9]{9}"))) {
                System.out.println("re-numberPhone, 10 digit phone number (Nhập lại số điện thoại gồm 10 số)");
            } else {
                break;
            }
        }

        //=======================================
        String emailCustomer;
        do {
            System.out.println("Email of customer enter (Nhập email của khách hàng");
            emailCustomer = sc.nextLine();
            if (!emailCustomer.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                System.out.println("Wrong email format (Email sai định dạng)");
            } else {
                break;
            }
        } while (true);
        //=======================================
        int choose;
        String customerType;
        CustomerType:
        do {
            while (true){
                try {
                    System.out.println("Customer type choose (chọn Loại khách hàng)\n1. Diamond\n2. Platinium\n3. Gold\n4. Silver\n5. Member");
                    choose = Integer.parseInt(sc.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("re-choose");
                }
            }

            switch (choose) {
                case 1:
                    customerType = "Diamond";
                    break CustomerType;
                case 2:
                    customerType = "Platinium";
                    break CustomerType;
                case 3:
                    customerType = "Gold";
                    break CustomerType;
                case 4:
                    customerType = "Silver";
                    break CustomerType;
                case 5:
                    customerType = "Member";
                    break CustomerType;
            }

        } while (true);

        //=======================================

        System.out.println("Address of customer enter (Nhập địa chỉ của khách hàng)");
        String addressCustomer = sc.nextLine();
        //=======================================


        Customer customer = new Customer(iDCustomer, nameCustomer, birthdayCustomer, gender, numberCMND, numberPhone, emailCustomer, customerType, addressCustomer);
        return customer;
    }

    public static String getInfoCustomer(Customer customer) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", customer.getiD(), customer.getName(), customer.getBirthday(), customer.getGender(), customer.getNumberCMND(), customer.getNumberPhone(), customer.getEmail(), customer.getCustomerType(), customer.getAddress());
    }
}
