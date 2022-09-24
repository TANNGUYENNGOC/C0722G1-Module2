package baitaplamthem1.service.impl;

import baitaplamthem1.model.Student;
import baitaplamthem1.model.Teacher;
import baitaplamthem1.service.ITeacherService;

import java.util.*;

public class TeacherService implements ITeacherService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();
    private static List<String> genderList = new ArrayList<>(Arrays.asList("Nam","Nữ","Khác"));

    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void displayTeacher() {
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void searchIDTeacher() {
        System.out.println("Nhập mã giáo viên cần tìm");
        String iD = sc.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getiD().equals(iD)){
                System.out.println(teacherList.get(i));
                break;
            }
        }
    }

    @Override
    public void searchNameTeacher() {
        System.out.println("Nhập giáo viên cần tìm");
        String name = sc.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getiD().contains(name)){
                System.out.println(teacherList.get(i));
            }
        }
    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhập mã giáo viên cần xóa: ");
        String iD = sc.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if(teacherList.get(i).getiD().equals(iD)){
                System.out.println("bấm Y để xóa thật: ");
                String choice = sc.nextLine();
                if(choice.equals("Y")){
                    teacherList.remove(i);
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
    public void sortTeacher() {
        for (int i = 0; i < teacherList.size() - 1; i++) {
            Teacher currentMin = teacherList.get(i);
            int currentMinIndex = i;
            for (int j = i + 1; j < teacherList.size(); j++) {
                if (currentMin.getName().compareTo(teacherList.get(j).getName()) > 0) {
                    currentMin = teacherList.get(j);
                    currentMinIndex = j;
                }
                if (currentMin.getName().compareTo(teacherList.get(j).getName()) == 0) {
                    int compare = currentMin.getiD().compareTo(teacherList.get(j).getiD());
                    if (compare > 0) {
                        currentMin = teacherList.get(j);
                        currentMinIndex = j;
                    }
                }
            }
            if (currentMinIndex != i) {
                teacherList.set(currentMinIndex, teacherList.get(i));
                teacherList.set(i, currentMin);
            }
        }
        displayTeacher();
    }


    public Teacher infoTeacher(){

        System.out.println("Mời bạn nhập mã giáo viên: ");
        String iD = sc.nextLine();
        System.out.println("Mời bạn nhập tên giáo viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String birthday = sc.nextLine();
        System.out.println("Mời bạn nhập giới tính giáo viên");
        String gender = sc.nextLine();
        while (genderList.indexOf(gender) == -1){
            System.out.println("Vui lòng nhập lại giới tính");
            gender = sc.nextLine();
        }
        System.out.println("Mời bạn nhập chuyên môn: ");
        String expertise = sc.nextLine();
        Teacher teacher = new Teacher(iD,name,birthday,gender,expertise);
        return teacher;
    }



}
