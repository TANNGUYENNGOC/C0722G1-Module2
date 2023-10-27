package case_study.utils.write_file;

import case_study.models.facilityModel.Facility;
import case_study.models.facilityModel.House;
import case_study.services.impl.FacilityServiceImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class WriteFileHouseUtils {
    public static void writeFileHouse(Map<House,Integer> houseMap){
        File file = new File("D:\\module_2\\src\\case_study\\data\\house_data.csv");
        Set<House> house = houseMap.keySet();
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
             bufferedWriter = new BufferedWriter(fileWriter);
            for (House house1: house) {
                bufferedWriter.write(FacilityServiceImpl.getInfoHouse(house1));
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
