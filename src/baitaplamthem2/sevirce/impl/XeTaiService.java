package baitaplamthem2.sevirce.impl;

import baitaplamthem2.model.XeTai;
import baitaplamthem2.sevirce.IXeTaiService;

import java.util.ArrayList;
import java.util.Scanner;

public class XeTaiService implements IXeTaiService {
    private static ArrayList<XeTai> listXeTai = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    @Override
    public void addXeTai() {
        listXeTai.add(infoXeTai());
        System.out.println("Thêm mới xe tải thành công");
    }

    @Override
    public void removeXeTai() {
        System.out.println("Nhập biển kiểm soát");
        String bienkiemSoat = sc.nextLine();
        for (int i = 0; i < listXeTai.size(); i++) {
            if(listXeTai.get(i).getBienKiemSoat().equals(bienkiemSoat)){
                listXeTai.remove(i);
                System.out.println("Xóa thành công");
            } else {
                System.out.println("Xóa ko thành công");
            }
        }
    }

    @Override
    public void displayAllXeTai() {
        for (XeTai xeTai: listXeTai) {
            System.out.println(xeTai);
        }
    }

    @Override
    public void searchXeTai(String bienSoXe) {
        for (int i = 0; i < listXeTai.size(); i++) {
            if(listXeTai.get(i).getBienKiemSoat().contains(bienSoXe)){
                System.out.println(listXeTai.get(i));
            } else {
                System.out.println("Không tìm thấy đối tượng cần tìm");
            }
        }
    }

    public XeTai infoXeTai(){
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = sc.nextLine();
        System.out.println("Nhập tên hãng sản xuất:");
        String tenHangSanXuat = sc.nextLine();
        System.out.println("Nhập năm sản xuất:");
        String namSanXuat = sc.nextLine();
        System.out.println("Nhập tên chủ sở hữu");
        String tenChuSoHuu = sc.nextLine();
        System.out.println("Nhập trọng tải: ");
        int trongTai = Integer.parseInt(sc.nextLine());
        XeTai xeTai = new XeTai(bienKiemSoat,tenHangSanXuat,namSanXuat,tenChuSoHuu,trongTai);
        return xeTai;
    }
}
