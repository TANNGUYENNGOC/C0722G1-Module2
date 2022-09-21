package ss12_java_collection_framework.excirse1.service.impl;

import ss12_java_collection_framework.excirse1.model.Phone;

import ss12_java_collection_framework.excirse1.service.IPhoneService;

import java.util.*;

public class PhoneService implements IPhoneService{
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Phone> listPhone = new ArrayList<>();
    @Override
    public void addPhone() {
        listPhone.add(infoPhone());
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removePhone() {
        int cout = 0;
        System.out.println("Nhập iD điện thoại cần xóa khỏi danh sách:");
        String iD = sc.nextLine();
        for (int i = 0; i < listPhone.size(); i++) {
            if(listPhone.get(i).getiD().equals(iD)){
                listPhone.remove(i);
                System.out.println("Xóa thành công");
                break;
            } else {
                cout++;
            }
        }
        if(cout == listPhone.size()){
            System.out.println("Không tìm thấy "+iD+" để xóa");
        }
    }

    @Override
    public void displayAllPhone() {
        if(listPhone.size()==0){
            System.out.println("Danh sách điện thoại trốn");
        } else {
            for (Phone phone: listPhone) {
                System.out.println(phone);
            }
        }
    }

    @Override
    public void updatePhone() {
        System.out.println("Nhập iD cần update");
        String iD = sc.nextLine();
        int cout= 0;

        for (int i = 0; i < listPhone.size(); i++) {
            if (listPhone.get(i).getiD().equals(iD)){
                System.out.println("Nhập giá tiền");
                double monney = Double.parseDouble(sc.nextLine());
                listPhone.get(i).setMonney(monney);

                System.out.println("Nhập tên điện thoại");
                String namePhone = sc.nextLine();
                listPhone.get(i).setName(namePhone);

                System.out.println("Nhập màu sắc: ");
                String color = sc.nextLine();
                listPhone.get(i).setColer(color);

                System.out.println("Nhập tên hãng");
                String product = sc.nextLine();
                listPhone.get(i).setProduction(product);
                break;
            } else {
                cout++;
            }
        }
        if(cout == listPhone.size()){
            System.out.println("không tìm thấy "+iD+" để update");
        }
    }

    @Override
    public void searchPhone() {
        System.out.println("Nhập tên Phone cần tìm:");
        String namePhone = sc.nextLine();
        for (int i = 0; i < listPhone.size(); i++) {
            if(listPhone.get(i).getName().contains(namePhone)){
                System.out.println(listPhone.get(i));
            }
        }
    }


    @Override
    public void sortUpAscending() {
        Collections.sort(listPhone, (Phone phone1, Phone phone2)->{
            if(phone1.getMonney() < phone2.getMonney()){
                return -1;
            } else if(phone1.getMonney() == phone2.getMonney()){
                return 0;
            } else {
                return 1;
            }
        });
        displayAllPhone();
    }

    @Override
    public void sortDecreasing() {
        Collections.sort(listPhone, (Phone phone1, Phone phone2)->{
            if(phone1.getMonney() < phone2.getMonney()){
                return 1;
            } else if(phone1.getMonney() == phone2.getMonney()){
                return 0;
            } else {
                return -1;
            }
        });
        displayAllPhone();
    }

    public Phone infoPhone(){
        System.out.println("Nhập id: ");
        String iD = sc.nextLine();
        System.out.println("Nhập tên điện thoại: ");
        String namePhone = sc.nextLine();
        System.out.println("Nhập giá tiền");
        double monney = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập màu sắc: ");
        String color = sc.nextLine();
        System.out.println("Nhập tên hãng");
        String product = sc.nextLine();
        Phone phone = new Phone(iD,monney,namePhone,color,product);
        return phone;
    }

}
