package ss5_access_modifier_and_static.practice.static_method;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Tấn");
        Student s2 = new Student(222, "Tấn anh hùng");
        Student s3 = new Student(333, "Tấn vipprono1");

        s1.display();
        s2.display();
        s3.display();
    }
}
