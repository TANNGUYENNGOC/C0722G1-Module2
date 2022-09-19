package baitaplamthem2.model;

public class XeTai extends Xe{
    private int trongTai;

    public XeTai(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }
    public XeTai(){

    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", tenHangSanXuat='" + getTenHangSanXuat() + '\'' +
                ", namSanXuat='" + getNamSanXuat() + '\'' +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                "trongTai=" + trongTai +
                '}';
    }
}
