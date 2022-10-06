package case_study.utils.read_file;

import case_study.models.facilityModel.Room;


import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileRoomUtils {
    public static Map<Room, Integer> readFileRoom(){
        Map<Room,Integer> roomMap = new LinkedHashMap<>();
        BufferedReader bufferedReader = null;
        try {
            File file = new File("D:\\module_2\\src\\case_study\\data\\room_data.csv");
            FileReader fileReader = new FileReader(file);
             bufferedReader = new BufferedReader(fileReader);
            String info[];
            String line;
            Room room;
            while ((line = bufferedReader.readLine()) != null){
                info = line.split(",");
                room = new Room(info[0],Double.parseDouble(info[1]),Double.parseDouble(info[2]),Integer.parseInt(info[3]),info[4],info[5]);
                roomMap.put(room,0);
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

        return roomMap;
    }
}
