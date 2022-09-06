package ss1_Introduction_to_Java.practice;

import java.util.Scanner;

//Giải phương trình bậc nhất
public class linear_equation_resolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner sc = new Scanner(System.in);

        System.out.println("a: ");
        double a = sc.nextDouble();

        System.out.println("b: ");
        double b = sc.nextDouble();

        System.out.println("c: ");
        double c = sc.nextDouble();

        if(a != 0){
            double answer = (c - b) / a;
            System.out.println("Equation pass with x = " + answer);
        } else {
            if(b==c){
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }

    }
}
