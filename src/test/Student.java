package test;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int age;
    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return id == student.id && age == student.age && Objects.equals(name, student.name);
//    }
    public  void stringA(Double a) {
        System.out.println("pt1"+a);
    }

    public  void stringA(String a) {
        System.out.println("pt2: "+a);
    }
    public static void stringB(String a) {
        System.out.println("pt2: "+a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }


    public void abc(){
        System.out.println("abc_1");
    }

    public double abc(int a,double b){
        return Double.parseDouble(String.valueOf(a + b));
    }

    public String abc(int a,int b){
        String c = "zxcvb";
        return c;
    }

}
