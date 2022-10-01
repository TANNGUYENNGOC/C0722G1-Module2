package ss17.excirse.excirse1.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String codeProduct;
    private String nameProduct;
    private String khanProduced;
    private double price;
    private String describe;

    public Product() {
    }

    public Product(String codeProduct, String nameProduct, String khanProduced, double price, String describe) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.khanProduced = khanProduced;
        this.price = price;
        this.describe = describe;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getKhanProduced() {
        return khanProduced;
    }

    public void setKhanProduced(String khanProduced) {
        this.khanProduced = khanProduced;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", khanProduced='" + khanProduced + '\'' +
                ", price='" + price + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
