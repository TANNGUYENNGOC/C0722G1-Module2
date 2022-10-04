package case_study.controllers;

import case_study.services.ICustomerService;
import case_study.services.impl.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    public void displayMenuCustomer(){
        Scanner sc = new Scanner(System.in);
        FuramaController furamaController = new FuramaController();
        ICustomerService iCustomerService = new CustomerServiceImpl();
        int choose;

        do {
            while (true){
                try {
                    System.out.println("1. Display list customers\n" +
                            "2. Add new customer\n" +
                            "3. Edit customer\n" +
                            "4. Return main menu\n");
                    System.out.println("What are your options?");
                    choose = Integer.parseInt(sc.nextLine());
                    System.out.println("----------------------------------------------");
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Please choose a number from 1 to 4");
                }
            }

            switch (choose){
                case 1:
                    iCustomerService.displayList();
                    break;
                case 2:
                    iCustomerService.addElement();
                    break;
                case 3:
                    iCustomerService.editCustomer();
                    break;
                case 4:
                    furamaController.displayMainMenu();
                    break;
                default:
                    System.out.println("please re-enter: ");
                    choose = Integer.parseInt(sc.nextLine());
                    break;
            }
        } while (true);
    }
}
