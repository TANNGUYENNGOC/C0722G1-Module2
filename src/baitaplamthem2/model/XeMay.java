package baitaplamthem2.model;

public class XeMay extends Xe{
    private double congXuat;

    public XeMay(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, double congXuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congXuat = congXuat;
    }
    public XeMay(){

    }

    public double getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(double congXuat) {
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", tenHangSanXuat='" + getTenHangSanXuat() + '\'' +
                ", namSanXuat='" + getNamSanXuat() + '\'' +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                "congXuat=" + congXuat +
                '}';
    }
}
