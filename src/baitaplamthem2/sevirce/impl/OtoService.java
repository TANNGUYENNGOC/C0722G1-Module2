package baitaplamthem2.sevirce.impl;

import baitaplamthem2.model.Oto;
import baitaplamthem2.sevirce.IOtoService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoService implements IOtoService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Oto> listOto = new ArrayList();
    private static File fileOto = new File("D:\\module_2\\src\\baitaplamthem2\\data\\Oto.txt");
    private static Oto oto = new Oto();

    @Override
    public void addOto() {
        listOto.add(infoOto());
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removeOto() {
        System.out.println("Nhập biển kiểm soát cần xóa: ");
        String bienKiemSoat = sc.nextLine();

        if (listOto.size() == 0) {
            System.out.println("Không tìm thấy " + bienKiemSoat + " để xóa");
            return;
        }
        for (int i = 0; i < listOto.size(); i++) {
            if (listOto.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                System.out.println("Bấm Y để xóa: ");
                String y = sc.nextLine();
                if (y.equals("Y")) {
                    listOto.remove(i);
                    System.out.println("Xóa thành công");
                    break;
                }
            }
        }

    }

    @Override
    public void displayAllOto() {
        if(listOto.size()==0){
            System.out.println("Danh sách ô tô trống, vui lòng thêm mới");
        } else {
            for (Oto oto : listOto) {
                System.out.println(oto);
            }
        }
    }

    @Override
    public void searchOto(String bienSo) {
        for (int i = 0; i < listOto.size(); i++) {
            if (listOto.get(i).getBienKiemSoat().contains(bienSo)) {
                System.out.println(listOto.get(i));
            }
        }
    }


    public Oto infoOto() {
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = sc.nextLine();
        System.out.println("Nhập tên hãng sản xuất:");
        String tenHangSanXuat = sc.nextLine();
        System.out.println("Nhập năm sản xuất:");
        String namSanXuat = sc.nextLine();
        System.out.println("Nhập tên chủ sở hữu");
        String tenChuSoHuu = sc.nextLine();
        System.out.println("Nhập số chỗ ngồi:");
        int soChoNgoi = Integer.parseInt(sc.nextLine());
        String kieuXe = "";
        int luaChon;
        do {
            System.out.println("Nhập kiểu xe: \n" +
                    "1. Xe khách\n" +
                    "2. Xe du lịch");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    kieuXe = "Xe khách";
                    break;
                case 2:
                    kieuXe = "Du lịch";
                    break;
            }
        } while (luaChon != 1 && luaChon != 2);
        Oto oto = new Oto(bienKiemSoat, tenHangSanXuat, namSanXuat, tenChuSoHuu, soChoNgoi, kieuXe);
        return oto;
    }
    public void writeOto(){
        listOto = readFileOto();
        try {
            FileWriter fileWriter = new FileWriter(fileOto);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Oto oto: listOto) {
//                bufferedWriter.write();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Oto> readFileOto(){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileOto);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] infoOto;
            Oto oto;
            while ((line = bufferedReader.readLine())!=null){
                infoOto = line.split(",");
                oto = new Oto(infoOto[0],infoOto[1],infoOto[2],infoOto[3],Integer.parseInt(infoOto[4]),infoOto[5]);
                listOto.add(oto);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOto;
    }
    public String getInfoOto(){
        return String.format("%s,%s,%s,%s,%s,%s",oto.getBienKiemSoat());
    }
}
