package ss16_demo_io_text_file.controller;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\module_2\\src\\ss16_demo_io_text_file\\data\\input.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
