package case_study.models.facilityModel;

public abstract class Facility {
    // class cơ sở vật chất
    private String serviceName; //Tên dịch vụ
    private double usableArea; //Diện tích sử dụng
    private double rentalCosts;//Chi phí thuê
    private int MaximumNumberOfPeople; //SỐ lượng người tối đa
    private String rentalType; //Kiểu thuê (bao gồm thuê theo ngày, tháng, năm, giờ)

    public Facility() {
    }

    public Facility(String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        MaximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return MaximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        MaximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", MaximumNumberOfPeople=" + MaximumNumberOfPeople +
                ", rentalType=" + rentalType +
                '}';
    }
}
