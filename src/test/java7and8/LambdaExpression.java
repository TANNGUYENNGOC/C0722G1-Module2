package test.java7and8;

public class LambdaExpression {
    public static void main(String[] args) {
        // Java 7
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello, World!");
//            }
//        };
//        runnable.run();

        // Java 8
        Runnable runnable = () -> System.out.println("Hello, World!");
        runnable.run();

    }

}
