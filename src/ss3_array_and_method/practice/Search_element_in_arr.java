package ss3_array_and_method.practice;

import java.util.Scanner;

public class Search_element_in_arr {
    public static void main(String[] args) {
        String[] student = {"Công","Tấn","Bảo","Đạt","Khánh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name is Student: ");
        String inputName = sc.nextLine();

        boolean check = false;
        for (int i = 0; i < student.length; i++) {
            if(inputName.equals(student[i])){
                System.out.println("Position of the students in the list " + inputName + " is: " + i);
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("Not found" + inputName + " in the list.");
        }
    }
}
