package case_study.models.facilityModel;

public class House extends Facility{
    private String roomStandard; //Tiêu chuẩn phòng
    private double poolArea;
    private int numberOfFloors; //Số tầng



    public House() {
    }

    public House(String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
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
    public double getPoolArea() {
        return poolArea;
    }

    @Override
    public String toString() {
        return
                "serviceName="+ getServiceName()+"\t"+
                ", usableArea="+ getUsableArea()+"\t"+
                ", rentalCosts="+ getRentalCosts()+"\t"+
                ", MaximumNumberOfPeople="+getMaximumNumberOfPeople()+"\t"+
                ", rentalType="+ getRentalType()+"\t"+
                ", roomStandard='" + roomStandard + '\t' +
                ", numberOfFloors=" + numberOfFloors;
    }
}
