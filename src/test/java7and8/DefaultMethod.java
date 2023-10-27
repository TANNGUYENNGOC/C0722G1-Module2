package test.java7and8;

public class DefaultMethod implements IDefaultMethod {
//Java 7
//    @Override
//    public void doSomething() {
//        System.out.println("Doing something");
//    }

    //Java 8


    public static void main(String[] args) {
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.doSomething();
    }
}
