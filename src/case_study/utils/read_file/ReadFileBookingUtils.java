package case_study.utils.read_file;

import case_study.models.booking.Booking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class ReadFileBookingUtils {
    public static Set<Booking> readFileBooking(){
        Set<Booking> bookingSet = new TreeSet<>();
        File file = new File("D:\\module_2\\src\\case_study\\data\\booking_data.csv");
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String info[];
            String line;
            Booking booking;
            while ((line = bufferedReader.readLine())!=null){
                info = line.split(",");
                booking = new Booking(info[0], LocalDate.parse(info[1]),LocalDate.parse(info[2]),info[3],info[4],info[5]);
                bookingSet.add(booking);
            }
        } catch (IOException e){
            e.getMessage();
        }
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingSet;
    }
}
