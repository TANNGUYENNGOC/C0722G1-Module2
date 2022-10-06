package case_study.utils.write_file;

import case_study.models.facilityModel.Facility;
import case_study.models.facilityModel.Villa;
import case_study.services.impl.FacilityServiceImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class WriteFileVillaUtils {
    public static void writeFileVilla(Map<Villa,Integer> villaIntegerMap){
        File file = new File("D:\\module_2\\src\\case_study\\data\\villa_data.csv");
        Set<Villa> villas = villaIntegerMap.keySet();
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
             bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villa : villas){
                bufferedWriter.write(FacilityServiceImpl.getInfoVilla(villa));
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            e.getMessage();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
