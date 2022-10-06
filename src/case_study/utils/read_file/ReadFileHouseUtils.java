package case_study.utils.read_file;

import case_study.models.facilityModel.Facility;
import case_study.models.facilityModel.House;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileHouseUtils {
    public static Map<House , Integer> readFileHouse(){
        Map<House,Integer> facilityIntegerMap = new LinkedHashMap<>();
        File file = new File("D:\\module_2\\src\\case_study\\data\\house_data.csv");
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
             bufferedReader = new BufferedReader(fileReader);
            String info[];
            String line;
            House house;
            while ((line = bufferedReader.readLine()) != null){
                info = line.split(",");
                house = new House(info[0],Double.parseDouble(info[1]),Double.parseDouble(info[2]),Integer.parseInt(info[3]),info[4],info[5],Integer.parseInt(info[6]));
                facilityIntegerMap.put(house,0);
            }
        }catch (IOException e){
            e.getMessage();
        }
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return facilityIntegerMap;
    }
}
