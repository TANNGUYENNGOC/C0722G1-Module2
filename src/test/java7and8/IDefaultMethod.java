package test.java7and8;

public interface IDefaultMethod {
    //Java 7
//    void doSomething();
    //Java 8
    default void doSomething() {
        System.out.println("Doing something");
    }
}
