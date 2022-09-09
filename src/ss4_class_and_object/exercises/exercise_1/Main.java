package ss4_class_and_object.exercises.exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = Integer.parseInt(sc.nextLine());

        System.out.println("Enter b: ");
        double b = Integer.parseInt(sc.nextLine());

        System.out.println("Enter c: ");
        double c = Integer.parseInt(sc.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()<0){
            System.out.println("The equation has no real roots");
        } else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("The equation has one root: "+quadraticEquation.singleResult());
        } else {
            System.out.println("The equation has two roots:");
            System.out.println("r1 = "+quadraticEquation.getRoot1());
            System.out.println("r2 = "+quadraticEquation.getRoot2());
        }
    }
}
