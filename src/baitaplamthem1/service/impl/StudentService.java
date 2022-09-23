package baitaplamthem1.service.impl;

import baitaplamthem1.model.Student;
import baitaplamthem1.service.IStudentService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();
    private static List<String> genderList = new ArrayList<>(Arrays.asList("Nam","Nữ","Khác"));

    @Override
    public void addStudent() {
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Bạn đã thêm mới thành công");
    }

    @Override
    public void displayAllStudent() {
        for (Student student: studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập mã học viên cần xóa: ");
        String iD = sc.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getiD().equals(iD)){
                System.out.println("bấm Y để xóa thật: ");
                String choice = sc.nextLine();
                if(choice.equals("Y")){
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete =true;
                break;
            }
            if(!flagDelete){
                System.out.println("Không tìm thấy đối tượng cần xóa.");
            }
        }
    }

    @Override
    public void searchIDStudent() {
        System.out.println("Nhập mã học sinh cần tìm");
        String iD = sc.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getiD().equals(iD)){
                System.out.println(studentList.get(i));
                break;
            }
        }
    }

    @Override
    public void searchNameStudent() {
        System.out.println("Nhập tên học sinh cần tìm");
        String name = sc.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getiD().contains(name)){
                System.out.println(studentList.get(i));
            }
        }
    }


    public Student infoStudent(){

        System.out.println("Mời bạn nhập mã học sinh: ");
        String iD = sc.nextLine();
        System.out.println("Mời bạn nhập tên học sinh: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String birthday = sc.nextLine();
        System.out.println("Mời bạn nhập giới tính học sinh");
        String gender = sc.nextLine();
        while (genderList.indexOf(gender) == -1){
            System.out.println("Vui lòng nhập lại giới tính");
            gender = sc.nextLine();
        }
        System.out.println("Mời bạn nhập tên lớp: ");
        String nameClass = sc.nextLine();
        System.out.println("Mời bạn nhập điểm");
        double point = Double.parseDouble(sc.nextLine());
        Student student = new Student(iD,name,birthday,gender,nameClass,point);
        return student;
    }
}
