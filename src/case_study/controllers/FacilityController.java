package case_study.controllers;

import java.util.Scanner;

public class FacilityController {
    public void displayMenuFacility() {

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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("please re-enter: ");
                    choose = Integer.parseInt(sc.nextLine());
                    break;
            }

        } while (true);


    }
}
