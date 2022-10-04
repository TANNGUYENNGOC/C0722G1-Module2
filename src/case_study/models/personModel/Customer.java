package case_study.models.personModel;

import java.time.LocalDate;

public class Customer extends Person{
    private String customerType; //Loại khách
    private String address;

    public Customer() {
    }

    public Customer(String iD, String name, LocalDate birthday, String gender, String numberCMND, String numberPhone, String email, String customerType, String address) {
        super(iD, name, birthday, gender, numberCMND, numberPhone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "iD='" + getiD() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthday=" + getBirthday() +
                ", gender='" + getGender() + '\'' +
                ", numberCMND='" + getNumberCMND() + '\'' +
                ", numberPhone='" + getNumberPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
