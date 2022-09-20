package baitaplamthem2.controller;


import baitaplamthem2.model.XeMay;
import baitaplamthem2.sevirce.IOtoService;
import baitaplamthem2.sevirce.IXeMayService;
import baitaplamthem2.sevirce.IXeTaiService;
import baitaplamthem2.sevirce.impl.OtoService;
import baitaplamthem2.sevirce.impl.XeMayService;
import baitaplamthem2.sevirce.impl.XeTaiService;

import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);
    IXeTaiService iXeTaiService = new XeTaiService();
    IXeMayService iXeMayService = new XeMayService();
    IOtoService iOtoService = new OtoService();

    public void addPhuongTien(){
        int luaChon;
        do {
            System.out.println("Bạn muốn thêm phương tiện gì\n" +
                    "1. Thêm xe tải.\n" +
                    "2. Thêm ôtô. \n" +
                    "3. Thêm  xe máy.\n"+
                    "4. Thoát");
            System.out.println("--------------------------------------");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    iXeTaiService.addXeTai();
                    break;
                case 2:
                    iOtoService.addOto();
                    break;
                case 3:
                    iXeMayService.addXeMay();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
    public void hienThi(){
        int luaChon;
        do {
            System.out.println("Bạn muốn hiển thị phương tiện gì\n" +
                    "1. Hiển thị xe tải.\n" +
                    "2. Hiển thị ôtô. \n" +
                    "3. Hiển thị  xe máy.\n"+
                    "4. Thoát");
            System.out.println("-------------------------------------");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    iXeTaiService.displayAllXeTai();
                    break;
                case 2:
                    iOtoService.displayAllOto();
                    break;
                case 3:
                    iXeMayService.displayAllXeMay();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
    public void xoaPhuongTien(){
        int luaChon;
        do {
            System.out.println("Bạn muốn xóa loại phương tiện nào\n" +
                    "1. Xe tải.\n" +
                    "2. Ôtô. \n" +
                    "3. Xe máy.\n"+
                    "4. Thoát");
            System.out.println("--------------------------------------");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    iXeTaiService.removeXeTai();
                    break;
                case 2:
                    iOtoService.removeOto();
                    break;
                case 3:
                    iXeMayService.removeXeMay();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
    public void timKiemPhuongTienBangBienSoXe(){
        System.out.println("Nhập biển số cần tìm: ");
        String input = sc.nextLine();
        OtoService otoService = new OtoService();
        otoService.searchOto(input);
        XeMayService xeMayService = new XeMayService();
        xeMayService.searchXeMay(input);
        XeTaiService xeTaiService = new XeTaiService();
        xeTaiService.searchXeTai(input);
        System.out.println("--------------------------------------");

    }
}
