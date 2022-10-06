package case_study.utils.read_file;

import case_study.models.facilityModel.Villa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileVillaUtils {
    public static Map<Villa,Integer> readFileVilla(){
        Map<Villa,Integer> villaMap = new LinkedHashMap<>();
        BufferedReader bufferedReader = null;
        try {
            File file = new File("D:\\module_2\\src\\case_study\\data\\villa_data.csv");
            FileReader fileReader = new FileReader(file);
             bufferedReader = new BufferedReader(fileReader);
            String[] info;
            String line;
            Villa villa;
            while ((line = bufferedReader.readLine())!=null){
                info = line.split(",");
                villa = new Villa(info[0],Double.parseDouble(info[1]),Double.parseDouble(info[2]),Integer.parseInt(info[3]),info[4],info[5],Double.parseDouble(info[6]),Integer.parseInt(info[7]));
                villaMap.put(villa,0);
            }
        }
        catch (IOException e){
            e.getMessage();
        }
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return villaMap;
    }
}
