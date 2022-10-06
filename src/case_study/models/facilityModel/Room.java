package case_study.models.facilityModel;

public class Room extends Facility{
    private String freeService; //Dịch vụ miễn phí đi kèm

    public Room() {
    }

    public Room(String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
    @Override
    public String toString() {
        return "serviceName=" + getServiceName() + "\t" +
                ", usableArea=" + getUsableArea() + "\t" +
                ", rentalCosts=" + getRentalCosts() + "\t" +
                ", MaximumNumberOfPeople=" + getMaximumNumberOfPeople() + "\t" +
                ", rentalType=" + getRentalType() + "\t" +
                ", freeService="+freeService;
    }
}
