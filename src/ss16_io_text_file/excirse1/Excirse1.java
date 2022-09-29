package ss16_io_text_file.excirse1;

import java.io.*;

public class Excirse1 {
    public static void main(String[] args) throws IOException{

            File file1 = new File("D:\\module_2\\src\\ss16_io_text_file\\excirse1\\source_file.csv");
            File file2 = new File("D:\\module_2\\src\\ss16_io_text_file\\excirse1\\target_file.csv");

        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}
