package case_study.controllers;

import case_study.models.facilityModel.House;
import case_study.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityController {
    private FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public  void displayMenuFacility() {

        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("1.Display list facility\n" +
                            "2. Add new facility\n" +
                            "3. Display list facility maintenance\n" +
                            "4  Return main menu");
                    System.out.println("What are your options?");
                    choose = Integer.parseInt(sc.nextLine());
                    System.out.println("-----------------------------");
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please choose a number from 1 to 4");
                }
            }
            switch (choose) {
                case 1:
                    facilityService.displayList();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("please re-enter: ");
                    choose = Integer.parseInt(sc.nextLine());
                    break;
            }

        } while (true);

    }
    public void addNewFacility(){
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1. \tAdd New Villa\n" +
                    "2. \tAdd New House\n" +
                    "3. \tAdd New Room\n" +
                    "4. \tBack to menu");
            System.out.println("What are your options?");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
            }

        }while (true);
    }
}
