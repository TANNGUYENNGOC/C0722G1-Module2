package test.override_overload;

public class Demo  extends  Demo1{
    //Overload xảy ra khi có nhiều phương thức cùng tên nhưng khác tham số truyền vào
    // và có thể khác kiểu trả về
    // Xảy ra trong cùng 1 class
    // Xảy ra tại thời điểm compile
    // AM của các method xảy ra overload là gì cũng được
    // Thêm hành vi cho phương thức

    public int method(int a){
        return a;
    }
    public String method(){
        return "zzzzzzzzzzzz";
    }
    private void method(int a, int b){
        System.out.println(a+b);
    }

    // Override xảy ra tại thời điểm run time
    // trùng tên phương thức cha
    // xảy ra trong 2 class có quan hệ kế thừa
    // AM của lớp con phải lớn hơn hoặc bằng AM của lớp cha
    // Thay đổi hành vi của lớp cha
    // Giống tham số truyền vào và giống kiểu trả về của lớp cha
    @Override
    protected int sum(int a, int b) {
        return a + b;
    }
}
