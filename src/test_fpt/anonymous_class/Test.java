package test_fpt.anonymous_class;

public class Test {
    int x, y;

    public Test(int x, int y) {
        initialize(x,y);
    }

    public void initialize(int x, int y) {
        this.x = x*x;
        this.y=y*y;
    }

    public static void main(String[] args) {
//        truyền tham chiếu nên giá trị của 2 biến ko thay đổi qua quá trình thực thi của method
        int x = 9, y =5;
        Test obj = new Test(x,y);
        System.out.println(x+ " " + y);
    }
}
