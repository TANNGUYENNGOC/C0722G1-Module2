package baitaplamthem1.model;

public abstract class Person {
    private String iD;
    private String name;
    private String birthday;
    private String gender;

    public Person(String iD, String name, String birthday, String gender) {
        this.iD = iD;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Person() {
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "iD='" + iD + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
