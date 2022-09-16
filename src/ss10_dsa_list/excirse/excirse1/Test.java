package ss10_dsa_list.excirse.excirse1;

public class Test {
    public static class Student {
        private int id;
        private String name;

        public Student() {

        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student = new Student(1,"Tấn");
        Student student1 = new Student(2,"Công");
        Student student2 = new Student(3,"Sang");
        Student student3 = new Student(4,"Nhân");
        Student student4 = new Student(5,"Khánh");
        Student student6 = new Student(6,"Phương");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student);
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student6,2);


        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student5 = (Student) studentMyArrayList.elements[i];
            System.out.println(student5.getId()+" ");
            System.out.println(student5.getName());
        }

    }
}



