package case_study.models.booking;

import java.time.LocalDate;

public class Booking {
    private String iDBooking;
    private LocalDate dayStart;
    private LocalDate dayEnd;
    private String iDcustomer;
    private String nameService;
    private String serviceType;

    public Booking() {
    }

    public Booking(String iDBooking, LocalDate dayStart, LocalDate dayEnd, String iDcustomer, String nameService, String serviceType) {
        this.iDBooking = iDBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.iDcustomer = iDcustomer;
        this.nameService = nameService;
        this.serviceType = serviceType;
    }

    public String getiDBooking() {
        return iDBooking;
    }

    public void setiDBooking(String iDBooking) {
        this.iDBooking = iDBooking;
    }

    public LocalDate getDayStart() {
        return dayStart;
    }

    public void setDayStart(LocalDate dayStart) {
        this.dayStart = dayStart;
    }

    public LocalDate getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(LocalDate dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getiDcustomer() {
        return iDcustomer;
    }

    public void setiDcustomer(String iDcustomer) {
        this.iDcustomer = iDcustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "iDBooking='" + iDBooking + '\'' +
                ", dayStart=" + dayStart +
                ", dayEnd=" + dayEnd +
                ", iDcustomer='" + iDcustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}
