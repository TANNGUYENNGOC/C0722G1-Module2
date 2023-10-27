package test;

public class DemoStackAndHeap {
    public static void main(String[] args) {
        int a = 1;
        StringBuilder b = new StringBuilder("abc");

        thayDoi1(b);
        thayDoi(1);
        System.out.println("Giá trị của a: "+a);
        System.out.println("Giá trị của b: "+b);
    }

    public static void thayDoi( int a){
         a = 7;
    }
    public static void thayDoi1(StringBuilder a){
        a.append("aaaaa");
    }
}
