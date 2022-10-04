package case_study.models.facilityModel;

import java.time.LocalDateTime;

public class House extends Facility{
    private String roomStandard; //Tiêu chuẩn phòng
    private int numberOfFloors; //Số tầng

    public House() {
    }

    public House(String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, LocalDateTime rentalType, String roomStandard, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    @Override
    public String toString() {
        return "House{" +
                "serviceName="+ getServiceName()+"\n"+
                ", usableArea="+ getUsableArea()+"\n"+
                ", rentalCosts="+ getRentalCosts()+"\n"+
                ", MaximumNumberOfPeople="+getMaximumNumberOfPeople()+"\n"+
                ", rentalType="+ getRentalType()+"\n"+
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
