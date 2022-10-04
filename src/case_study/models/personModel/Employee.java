package case_study.models.personModel;

import java.time.LocalDate;

public class Employee extends Person{
    private String level; //Trình độ
    private String position; //Vị trí
    private double wage; //Lương

    public Employee() {
    }

    public Employee(String iD, String name, LocalDate birthday, String gender, String numberCMND, String numberPhone, String email, String level, String position, double wage) {
        super(iD, name, birthday, gender, numberCMND, numberPhone, email);
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "iD='" + getiD() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthday=" + getBirthday() +
                ", gender='" + getGender() + '\'' +
                ", numberCMND='" + getNumberCMND() + '\'' +
                ", numberPhone='" + getNumberPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}
