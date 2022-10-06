package case_study.utils.write_file;

import case_study.models.facilityModel.Room;
import case_study.services.impl.FacilityServiceImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class WriteFileRoomUtils {
    public static void writeFileRoom(Map<Room,Integer> roomMap){
        File file = new File("D:\\module_2\\src\\case_study\\data\\room_data.csv");
        Set<Room> rooms = roomMap.keySet();
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
             bufferedWriter = new BufferedWriter(fileWriter);
            for (Room room: rooms) {
                bufferedWriter.write(FacilityServiceImpl.getInfoRoom(room));
                bufferedWriter.newLine();
            }
        } catch (IOException e){
            e.getMessage();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
