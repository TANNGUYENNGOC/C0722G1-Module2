package case_study.utils.write_file;

import case_study.models.booking.Booking;
import case_study.services.impl.BookingServiceImpl;

import java.io.*;
import java.util.Set;

public class WriteFileBookingUtils {
    public static void writeFileBooking(Set<Booking> bookingSet){
        File file = new File("D:\\module_2\\src\\case_study\\data\\booking_data.csv");
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileReader = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileReader);
            for (Booking booking : bookingSet){
                bufferedWriter.write(BookingServiceImpl.getInfoBooking(booking));
            }
        }  catch (IOException e){
            e.getMessage();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
