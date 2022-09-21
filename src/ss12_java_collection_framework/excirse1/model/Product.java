package ss12_java_collection_framework.excirse1.model;

public abstract class Product {
    private String iD;
    private double monney;

    public Product(String iD, double monney) {
        this.iD = iD;
        this.monney = monney;
    }
    public Product(){

    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public double getMonney() {
        return monney;
    }

    public void setMonney(double monney) {
        this.monney = monney;
    }

    @Override
    public String toString() {
        return "Product{" +
                "iD='" + iD + '\'' +
                ", monney=" + monney +
                '}';
    }
}
