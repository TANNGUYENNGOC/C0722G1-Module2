package ss6_inheritance.demo1;

public class Test {
    public static void main(String[] args) {
        ConNguoi cn = new ConNguoi("Tấn", 2002);
        cn.an();
        cn.uong();
        cn.ngu();

        HocSinh hs = new HocSinh("Tấn",2002,"C0722G1","codegym");
        hs.an();
        hs.uong();
        hs.ngu();
        hs.lamBaiTap();
    }
}
