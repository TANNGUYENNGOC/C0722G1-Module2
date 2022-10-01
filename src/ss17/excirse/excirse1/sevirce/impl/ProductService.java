package ss17.excirse.excirse1.sevirce.impl;

import ss17.excirse.excirse1.model.Product;
import ss17.excirse.excirse1.sevirce.IProductSevirce;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductSevirce {
    public static final String link = "D:\\module_2\\src\\ss17\\excirse\\excirse1\\data\\product.txt";
    private static List<Product> productList = new ArrayList<>();
    @Override
    public void addProduct() {
        productList = readFileList();
        Product product = this.infoProduct();

        productList.add(product);
        writeFileList(productList);
        System.out.println("Nhập thành công");
    }

    @Override
    public void displayProduct() {
        productList = readFileList();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
        Scanner sc = new Scanner(System.in);
        productList = readFileList();
        System.out.print("Nhập tên sản phẩm bạn muốn tìm kiếm : ");
        String nameSearch = sc.nextLine();
        boolean flagSearch = false;
        for (Product product : productList) {
            if (product.getNameProduct().contains(nameSearch)) {
                flagSearch = true;
                System.out.println(product.toString());
            }
        }
        if (!flagSearch) {
            System.out.println("Không có sản phẩm nào được tìm thấy.");
        }
    }

    public static Product infoProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        String codeProduct = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String nameProduct = sc.nextLine();
        System.out.println("Nhập hãn sản xuất: ");
        String khanProduct = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Mô tả khác");
        String describe = sc.nextLine();
        Product product = new Product(codeProduct,nameProduct,khanProduct,price,describe);
        return product;
    }
    private List<Product> readFileList() {
        List<Product> productList;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(link);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            productList = new ArrayList<>();
            return productList;
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }

    private void writeFileList(List<Product> productList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(link);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
