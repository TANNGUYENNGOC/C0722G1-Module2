package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();
        CustomerController customerController = new CustomerController();
        int choose;
        do {
            while (true) {
                try {
                System.out.println("1. Employee Management\n" +
                        "2. Customer Management\n" +
                        "3. Facility Management\n" +
                        "4. Booking Management\n" +
                        "5. Promotion Management\n" +
                        "6. Exit\n");
                System.out.println("What are your options?");

                choose = Integer.parseInt(sc.nextLine());
                System.out.println("--------------------------------------");
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Please choose a number from 1 to 6");
                }
            }
            switch (choose){
                case 1:
                    employeeController.displayMenuEmployee();
                    break;
                case 2:
                    customerController.displayMenuCustomer();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("please re-enter: ");
                    choose = Integer.parseInt(sc.nextLine());
                    break;
            }
        } while (true);
    }

}
