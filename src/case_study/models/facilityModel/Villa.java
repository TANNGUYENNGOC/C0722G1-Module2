package case_study.models.facilityModel;

public class Villa extends Facility{
    private String roomStandard; //Tiêu chuẩn phòng
    private double poolArea; //Diện tích hồ bơi
    private int numberOfFloors; //Số tầng

    public Villa() {
    }

    public Villa(String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return
                "serviceName="+ getServiceName()+"\t"+
                ", usableArea="+ getUsableArea()+"\t"+
                ", rentalCosts="+ getRentalCosts()+"\t"+
                ", MaximumNumberOfPeople="+getMaximumNumberOfPeople()+"\t"+
                ", rentalType="+ getRentalType()+"\t"+
                ", roomStandard='" + roomStandard + "\t" +
                ", poolArea=" + poolArea + "\t" +
                ", numberOfFloors=" + numberOfFloors;
    }
}
