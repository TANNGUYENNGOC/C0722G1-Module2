package baitaplamthem1.service.impl;

import baitaplamthem1.model.Student;
import baitaplamthem1.model.Teacher;
import baitaplamthem1.service.ITeacherService;

import java.io.*;
import java.util.*;

public class TeacherService implements ITeacherService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();
    private static List<String> genderList = new ArrayList<>(Arrays.asList("Nam","Nữ","Khác"));

    @Override
    public void addTeacher() throws IOException {
        teacherList = readFileTeacher();
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công");
        writeFileTeacher(teacherList);
    }

    @Override
    public void displayTeacher() throws IOException {
//        for (Teacher teacher: teacherList) {
//            System.out.println(teacher);
//        }
        teacherList = readFileTeacher();
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void searchIDTeacher() throws IOException {
        teacherList = readFileTeacher();
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
    public void searchNameTeacher() throws IOException {
        teacherList = readFileTeacher();
        System.out.println("Nhập giáo viên cần tìm");
        String name = sc.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getName().contains(name)){
                System.out.println(teacherList.get(i));
            }
        }
    }

    @Override
    public void removeTeacher() throws IOException {
        teacherList = readFileTeacher();
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
        }
        if(!flagDelete){
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
          writeFileTeacher(teacherList);
    }

    @Override
    public void sortTeacher() throws IOException {
        teacherList = readFileTeacher();
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

    public void writeFileTeacher(List<Teacher> teacherList) throws IOException {
        File file = new File("D:\\module_2\\src\\baitaplamthem1\\data\\teacher.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Teacher teacher: teacherList) {
            bufferedWriter.write(teacher.getInfoTeacher());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public List<Teacher> readFileTeacher() throws IOException {
        teacherList = new ArrayList<>();
        File file = new File("D:\\module_2\\src\\baitaplamthem1\\data\\teacher.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String info[];
        Teacher teacher;

        while ((line = bufferedReader.readLine()) != null){
            info = line.split(",");
            teacher = new Teacher(info[0],info[1],info[2],info[3],info[4]);
            teacherList.add(teacher);
        }
        bufferedReader.close();
        return teacherList;
    }
}
