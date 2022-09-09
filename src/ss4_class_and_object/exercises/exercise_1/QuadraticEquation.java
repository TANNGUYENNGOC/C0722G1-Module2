package ss4_class_and_object.exercises.exercise_1;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        double delta = this.b*b - 4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        double r1 = (-this.b + Math.sqrt(Math.pow(this.b,2) - (4*a*c)))/(2*a);
        return r1;
    }

    public double getRoot2(){
        double r2 = (-this.b - Math.sqrt(Math.pow(this.b,2) - (4*a*c)))/(2*a);
        return r2;
    }
    public double singleResult(){
        return -this.b/(2*this.b);
    }
}
