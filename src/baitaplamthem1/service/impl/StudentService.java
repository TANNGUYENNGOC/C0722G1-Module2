package baitaplamthem1.service.impl;

import baitaplamthem1.model.Student;
import baitaplamthem1.service.IStudentService;

import java.util.*;

public class StudentService implements IStudentService{
    private static Scanner sc = new Scanner(System.in);
    private static Student student1 = new Student("STD1","Nguyễn Ngọc Tấn","26/05/2002","Nam","C0722G1",8);
    private static Student student2 = new Student("STD3","Nguyễn Văn A","11/03/2000","Nam","C0722G1",5);
    private static Student student3 = new Student("STD9","Nguyễn Tấn B","29/11/2001","Nam","C0722G1",10);
    private static Student student5 = new Student("STD3","Hoàng Thị C","21/06/1997","Nữ","C0722G1",7);
    private static Student student4 = new Student("STD2","Nguyễn LƯơng Yến Nhi","12/08/2004","Nữ","C0722G1",10);
    private static List<Student> studentList = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5));

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
    public void sortStudent() {
        for (int i = 0; i < studentList.size() - 1; i++) {
            Student currentMin = studentList.get(i);
            int currentMinIndex = i;
            for (int j = i + 1; j < studentList.size(); j++) {
                if (currentMin.getName().compareTo(studentList.get(j).getName()) > 0) {
                    currentMin = studentList.get(j);
                    currentMinIndex = j;
                }
                if (currentMin.getName().compareTo(studentList.get(j).getName()) == 0) {
                    int compare = currentMin.getiD().compareTo(studentList.get(j).getiD());
                    if (compare > 0) {
                        currentMin = studentList.get(j);
                        currentMinIndex = j;
                    }
                }
            }
            if (currentMinIndex != i) {
                studentList.set(currentMinIndex, studentList.get(i));
                studentList.set(i, currentMin);
            }
        }
        displayAllStudent();
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
        double point;
        while (true){
            try {
                System.out.println("Mời bạn nhập điểm");
                point = Double.parseDouble(sc.nextLine());
                while (point < 0 || point > 10){
                    System.out.println("Vui lòng nhầm điểm trong khoảng từ 0 đến 10");
                    point = Double.parseDouble(sc.nextLine());
                }
                break;
            } catch (NumberFormatException e){
                System.out.println("Điểm sai định dạng, nhập lại: ");
            }
        }
        Student student = new Student(iD,name,birthday,gender,nameClass,point);
        return student;
    }
}
