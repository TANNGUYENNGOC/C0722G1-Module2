package case_study.controllers;

import case_study.services.IEmployeeService;
import case_study.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    public void displayMenuEmployee(){
        IEmployeeService iEmployeeService = new EmployeeServiceImpl();
        FuramaController furamaController = new FuramaController();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("1. Display list employees\n" +
                        "2. Add new employee\n" +
                        "3. Edit employee\n" +
                        "4. Return main menu\n");
                System.out.println("What are your options?");
                choose = Integer.parseInt(sc.nextLine());
                    System.out.println("--------------------------------------");
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Please choose a number from 1 to 4");
                }
            }
            switch (choose){
                case 1:
                    iEmployeeService.displayList();
                    break;
                case 2:
                    iEmployeeService.addElement();
                    break;
                case 3:
                    iEmployeeService.editInfoEmployee();
                    break;
                case 4:
                     break;
                default:
                    System.out.println("please re-enter");
                    choose = Integer.parseInt(sc.nextLine());
                    break;
            }
        } while (true);

    }
}
