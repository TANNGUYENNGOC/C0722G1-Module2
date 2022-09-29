package ss16_io_text_file.excirse2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Excirse2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\module_2\\src\\ss16_io_text_file\\excirse2\\data.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Country> countryList = new ArrayList<>();
        String[] info;
        Country country;
        while ((line = bufferedReader.readLine()) != null){
            info = line.split(",");
            country = new Country(Integer.parseInt(info[0]),info[1],info[2]);
            countryList.add(country);
        }
        bufferedReader.close();
        for (Country country1: countryList) {
            System.out.println(country1);
        }
    }
}
