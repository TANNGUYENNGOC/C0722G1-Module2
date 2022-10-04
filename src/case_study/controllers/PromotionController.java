package case_study.controllers;

import java.util.Scanner;

public class PromotionController {
    public void displayMenuPromotion(){
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            while (true){
                try {
                    System.out.println("1. Display list customers use service\n" +
                            "2. Display list customers get voucher\n" +
                            "3. Return main menu\n");
                    System.out.println("What are your options?");
                    choose = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Please choose a number from 1 to 3");
                }
            }


            switch (choose){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                default:
                    System.out.println("please re-enter: ");
                    choose = Integer.parseInt(sc.nextLine());
                    break;
            }
        } while (true);
    }
}
