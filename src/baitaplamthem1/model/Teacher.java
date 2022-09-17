package baitaplamthem1.model;

public class Teacher extends Person{
    private String expertise;

    public Teacher(String iD, String name, String birthday, String gender, String expertise) {
        super(iD, name, birthday, gender);
        this.expertise = expertise;
    }

    public Teacher(){

    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "iD='" + getiD() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthday='" + getBirthday()+ '\'' +
                ", gender='" + getGender() + '\'' +
                "expertise='" + expertise + '\'' +
                '}';
    }
}
