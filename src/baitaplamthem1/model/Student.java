package baitaplamthem1.model;

import java.util.Comparator;

public class Student extends Person implements Comparable{
    private String _class;
    private double point;

    public Student(String iD, String name, String birthday, String gender, String _class, double point) {
        super(iD, name, birthday, gender);
        this._class = _class;
        this.point = point;
    }

    public Student() {
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iD='" + getiD() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthday='" + getBirthday()+ '\'' +
                ", gender='" + getGender() + '\'' +
                "_class='" + _class + '\'' +
                ", point=" + point +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((Student) o).getName());

    }
}
