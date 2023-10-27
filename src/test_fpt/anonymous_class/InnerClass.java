package test_fpt.anonymous_class;

public class InnerClass {
    private int data = 30;

    void display() {
        class Local{
            void msg () {
                System.out.println(data);
            }
        }
        Local local = new Local();
        local.msg();
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.display();
    }
}


