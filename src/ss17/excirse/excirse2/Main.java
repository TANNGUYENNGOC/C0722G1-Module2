package ss17.excirse.excirse2;

import java.io.*;

public class Main {
    private static String sourceFile = "D:\\module_2\\src\\ss17\\excirse\\excirse2\\source_file.dat";
    private static String targetFilie = "D:\\module_2\\src\\ss17\\excirse\\excirse2\\target_file.dat";
   private static void writeFile(String s){
        FileOutputStream fos;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(sourceFile);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
        } catch (IOException e){
            e.printStackTrace();
        }
       try {
           oos.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

   private static void readFile(File source, File target) throws IOException {
       InputStream is = null;
       OutputStream os = null;
       try{
           if (!source.exists()) {
               throw new FileNotFoundException();
           }

           is = new FileInputStream(source);
           os = new FileOutputStream(target);
           byte[] bytes = new byte[1024];
           int length;
           int count = 0;
           while ((length = is.read(bytes)) > 0) {
               os.write(bytes, 0, length);
               count += length;
           }
           System.out.println("Số byte trong tệp : " + count);
       }
       catch (FileNotFoundException e){
           System.out.println("File ko tồn tại");
       }
       catch (IOException e){
            e.printStackTrace();
       }
       finally {
           try {
               assert is != null;
               is.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
           try {
               assert os != null;
               os.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
   }

    public static void main(String[] args) throws IOException {
       String s = "Đoàn quân Việt Nam đi chung lòng cứu quốc, bước chân dồn vang trên đường gập ghềnh xa, cờ in máu chiến thắng mang hồn nước, súng ngoài xa chen khúc quân hành ca, đường vinh quang xây xác quân thù, thắng gian lao cùng nhau lập chiến khu, vì nhân dân chiến đấu không ngừng, tiến mau ra sa trường. Tiến lên, cùng tiến lên, nước non Việt Nam ta vững bền.\n";
        Main.writeFile(s);
        File sourceFile = new File("D:\\module_2\\src\\ss17\\excirse\\excirse2\\source_file.dat");
        File targetFile = new File("D:\\module_2\\src\\ss17\\excirse\\excirse2\\target_file.dat");
        readFile(sourceFile, targetFile);
        System.out.println("Copy completed");
    }
}
