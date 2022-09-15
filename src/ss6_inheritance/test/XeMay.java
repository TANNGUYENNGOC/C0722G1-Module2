package ss6_inheritance.test;

public class XeMay extends Xe{
    private String name;
    private int gia;

    public XeMay(String loaiXe, String color, String name, int gia) {
        super(loaiXe, color);
        this.name = name;
        this.gia = gia;
    }

    public XeMay(String loaiXe, String color) {
        super(loaiXe, color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    //Tại s lại ko thể kế thừa lại tài sản private
}
