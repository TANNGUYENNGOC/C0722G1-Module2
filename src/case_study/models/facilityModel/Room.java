package case_study.models.facilityModel;

import java.time.LocalDateTime;

public class Room extends Facility{
    private String freeService; //Dịch vụ miễn phí đi kèm

    public Room() {
    }

    public Room(String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, LocalDateTime rentalType, String freeService) {
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
        return "House{" +
                "serviceName=" + getServiceName() + "\n" +
                ", usableArea=" + getUsableArea() + "\n" +
                ", rentalCosts=" + getRentalCosts() + "\n" +
                ", MaximumNumberOfPeople=" + getMaximumNumberOfPeople() + "\n" +
                ", rentalType=" + getRentalType() + "\n" +
                ", freeService="+freeService;
    }
}
