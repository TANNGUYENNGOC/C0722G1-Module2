package case_study.controllers;

import case_study.services.impl.BookingServiceImpl;

import java.util.Scanner;

public class BookingController {
    public void displayMenuBooking(){
        Scanner sc = new Scanner(System.in);
        BookingServiceImpl bookingService = new BookingServiceImpl();
        int choose;
        do {
            while (true){
                try {
                    System.out.println("1. Add new booking\n" +
                            "2. Display list booking\n" +
                            "3. Create new constracts\n" +
                            "4. Display list contracts\n" +
                            "5. Edit contracts\n" +
                            "6. Return main menu\n");

                    choose = Integer.parseInt(sc.nextLine());
                    System.out.println("--------------------------------------");
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Please choose a number from 1 to 6");
                }
            }
            switch (choose){
                case 1:
                    bookingService.displayList();
                    break;
                case 2:
                    bookingService.addElement();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("please re-enter: ");
                    choose = Integer.parseInt(sc.nextLine());
                    break;
            }
        } while (true);
    }
}
