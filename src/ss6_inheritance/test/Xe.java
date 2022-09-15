package ss6_inheritance.test;

public class Xe {
    private String loaiXe;
    private String color;

    public Xe(String loaiXe, String color) {
        this.loaiXe = loaiXe;
        this.color = color;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
