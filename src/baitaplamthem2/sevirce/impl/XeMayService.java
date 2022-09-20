package baitaplamthem2.sevirce.impl;

import baitaplamthem2.model.XeMay;
import baitaplamthem2.sevirce.IXeMayService;

import java.util.ArrayList;
import java.util.Scanner;

public class XeMayService implements IXeMayService {
    private static ArrayList<XeMay> listXeMay = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void addXeMay() {
        listXeMay.add(infoXeMay());
        System.out.println("Thêm mới xe máy thành công");
    }

    @Override
    public void removeXeMay() {
        System.out.println("Nhập biển ");
        String bienSoXe = sc.nextLine();
        if (listXeMay.size() == 0) {
            System.out.println("Không tìm thấy " + bienSoXe + " để xóa");
            return;
        }
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getBienKiemSoat().equals(bienSoXe)) {
                listXeMay.remove(i);
                System.out.println("Xóa thành công " + bienSoXe);
                break;

            }
        }

    }

    @Override
    public void displayAllXeMay() {
        if (listXeMay.size() == 0) {
            System.out.println("Danh sách xe máy trống, vui lòng thêm mới");
        } else {
            for (XeMay xeMay : listXeMay) {

                System.out.println(xeMay);

            }
        }
    }

    @Override
    public void searchXeMay(String bienSo) {
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getBienKiemSoat().contains(bienSo)) {
                System.out.println(listXeMay.get(i));
            } else {
                System.out.println("Không tìm thấy đối tượng cần tìm");
            }
        }
    }

    public XeMay infoXeMay() {
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = sc.nextLine();
        System.out.println("Nhập tên hãng sản xuất:");
        String tenHangSanXuat = sc.nextLine();
        System.out.println("Nhập năm sản xuất:");
        String namSanXuat = sc.nextLine();
        System.out.println("Nhập tên chủ sở hữu");
        String tenChuSoHuu = sc.nextLine();
        System.out.println("Nhập công suất xe: ");
        double congXuat = Double.parseDouble(sc.nextLine());
        XeMay xeMay = new XeMay(bienKiemSoat, tenHangSanXuat, namSanXuat, tenChuSoHuu, congXuat);
        return xeMay;
    }
}
