package case_study.services.impl;

import case_study.models.booking.Booking;
import case_study.services.IBookingService;
import case_study.utils.read_file.ReadFileBookingUtils;
import case_study.utils.write_file.WriteFileBookingUtils;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements IBookingService {
    static Set<Booking> bookingSet = new TreeSet<>();
    static CustomerServiceImpl serviceType = new CustomerServiceImpl();
    @Override
    public void createNewConstracts() {

    }

    @Override
    public void displayListContracts() {

    }

    @Override
    public void editContracts() {

    }

    @Override
    public void displayList() {
        bookingSet = ReadFileBookingUtils.readFileBooking();
        for (Booking booking : bookingSet){
            System.out.println(booking);
        }
    }

    @Override
    public void addElement() {
        bookingSet = ReadFileBookingUtils.readFileBooking();
        serviceType.displayList();
        bookingSet.add(infoBooking());
        WriteFileBookingUtils.writeFileBooking(bookingSet);
    }
    public Booking infoBooking (){
        Scanner sc = new Scanner(System.in);
        System.out.println("iDBooking enter (Nhập mã booking)");
        String iDBooking = sc.nextLine();
        System.out.println("dayStart enter (Nhập ngày bắt đầu)");
        LocalDate dayStart = LocalDate.parse(sc.nextLine());
        System.out.println("dayEnd enter (Nhập ngày kết thúc)");
        LocalDate dayEnd = LocalDate.parse(sc.nextLine());
        System.out.println("iDcustomer enter (Nhập mã khách hàng)");
        String iDcustomer = sc.nextLine();
        System.out.println("nameService enter (Nhập tên dịch vụ)");
        String nameService = sc.nextLine();
        System.out.println("serviceType enter (Nhập loại dịch vụ)");
        String serviceType = sc.nextLine();
        Booking booking = new Booking(iDBooking,dayStart,dayEnd,iDcustomer,nameService,serviceType);
        return booking;
    }
    public static String getInfoBooking(Booking booking){
        return String.format("%s,%s,%s,%s,%s,%s",booking.getiDBooking(),booking.getDayStart(),booking.getDayEnd(),booking.getiDcustomer(),booking.getNameService(),booking.getServiceType());
    }
}
