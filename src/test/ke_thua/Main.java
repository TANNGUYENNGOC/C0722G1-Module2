package test.ke_thua;

import test.phamvitruycap.Teacher;

public class Main extends Teacher{
    public Main(int id, String name) {
        super(id, name);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1,"Nam");
        System.out.println(teacher);
    }
}
