package case_study.services.impl;

import case_study.models.facilityModel.Facility;
import case_study.models.facilityModel.House;
import case_study.models.facilityModel.Room;
import case_study.models.facilityModel.Villa;
import case_study.services.IFacilityService;
import case_study.utils.read_file.ReadFileHouseUtils;
import case_study.utils.read_file.ReadFileRoomUtils;
import case_study.utils.read_file.ReadFileVillaUtils;
import case_study.utils.write_file.WriteFileHouseUtils;
import case_study.utils.write_file.WriteFileRoomUtils;
import case_study.utils.write_file.WriteFileVillaUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements IFacilityService {
    Scanner sc = new Scanner(System.in);
    static Map<House, Integer> houseMap = new LinkedHashMap<>();
    static Map<Room, Integer> roomMap = new LinkedHashMap<>();
    static Map<Villa, Integer> vilaMap = new LinkedHashMap<>();

    @Override
    public void eiditFacility() {

    }

    @Override
    public void addNewVilla() {
        vilaMap = ReadFileVillaUtils.readFileVilla();
        vilaMap.put(infoVilla(), 0);
        WriteFileVillaUtils.writeFileVilla(vilaMap);
    }

    @Override
    public void addNewHouse() {
//        Set<House> houseSet = houseMap.keySet();
        houseMap = ReadFileHouseUtils.readFileHouse();
        houseMap.put(infoHouse(), 0);
        WriteFileHouseUtils.writeFileHouse(houseMap);

    }

    @Override
    public void addNewRoom() {
        roomMap = ReadFileRoomUtils.readFileRoom();
        roomMap.put(infoRoom(), 0);
        WriteFileRoomUtils.writeFileRoom(roomMap);
    }

    @Override
    public void displayList() {
        houseMap = ReadFileHouseUtils.readFileHouse();
        Set<House> houseSet = houseMap.keySet();
        System.out.println("List house");
        for (House house : houseSet) {
            System.out.println(house);
        }
        System.out.println("----Furama----");
        roomMap = ReadFileRoomUtils.readFileRoom();
        System.out.println("List room");
        Set<Room> roomSet = roomMap.keySet();
        for (Room room : roomSet) {
            System.out.println(room);
        }
        System.out.println("----Furama----");

        vilaMap = ReadFileVillaUtils.readFileVilla();
        System.out.println("List villa");
        Set<Villa> villaSet = vilaMap.keySet();
        for (Villa villa : villaSet) {
            System.out.println(villa);
        }
        System.out.println("----Furama----");

    }

    @Override
    public void addElement() {

    }

    public Villa infoVilla() {
        String serviceName;
        while (true) {
            System.out.println("Service ID enter, ex:SV-VL0123 (Nhập mã dịch vụ, vd: SV-VL0123)");
            serviceName = sc.nextLine();
            if (serviceName.matches("SV-VL[0-9]{4}")) {
                break;
            } else {
                System.out.println("please re-Service ID enter (Nhập lại mã dịch vụ)");
            }
        }
        //================================================================
        double usableArea;
        while (true) {
            try {
                System.out.println("Usable Area enter (Nhập diện tích sử dụng)");
                usableArea = Double.parseDouble(sc.nextLine());
                if (usableArea <= 30) {
                    System.out.println("please re-area enter > 30 ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-area number");
            }
        }

        //===============================================================
        double rentalCosts;
        while (true) {
            try {
                System.out.println("Rental Costs enter (Nhập chi phí thuê)");
                rentalCosts = Double.parseDouble(sc.nextLine());
                if (rentalCosts <= 0) {
                    System.out.println("please re-rental cost enter (Nhập lại chi phí thuê)");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-rental cost enter (Nhập lại chi phí thuê)");
            }
        }
        //===============================================================
        int maximumNumberOfPeople;
        while (true) {
            try {
                System.out.println("Maximum Number Of People enter (Nhập số lượng người tối đa)");
                maximumNumberOfPeople = Integer.parseInt(sc.nextLine());
                if (maximumNumberOfPeople > 20 || maximumNumberOfPeople < 0) {
                    System.out.println("Number of people enter > 0 and <20");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-Maximum Number Of People enter (Nhập lại số lượng người tối đa)");
            }
        }

        //=================================================================
        String rentalType;
        int chooseRentalType;
        RTT:
        do {
            try {
                System.out.println("Rental Type enter (Nhập kiểu thuê)\n1.Year (Năm)\n2. Month(Tháng)\n3. Day (Ngày)\n4. Hours (Giờ)");
                chooseRentalType = Integer.parseInt(sc.nextLine());
                switch (chooseRentalType) {
                    case 1:
                        rentalType = "Year";
                        break RTT;
                    case 2:
                        rentalType = "Month";
                        break RTT;
                    case 4:
                        rentalType = "Day";
                        break RTT;
                    case 3:
                        rentalType = "Hours";
                        break RTT;
                    default:
                        System.out.println("Please re-Rental Type enter");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please re-Rental Type enter");
            }


        } while (true);


        //=================================================================
        int chooseRoomStandard;
        String roomStandard;
        ZXC:
        do {
            try {
                System.out.println(" (nhập tiêu chuẩn phòng\n1. 1 star\n2. 2 star\n3. 3 star\n4. 4 star\n5. 5 star)");
                chooseRoomStandard = Integer.parseInt(sc.nextLine());
                switch (chooseRoomStandard) {
                    case 1:
                        roomStandard = "1 star";
                        break ZXC;
                    case 2:
                        roomStandard = "2 star";
                        break ZXC;
                    case 3:
                        roomStandard = "3 star";
                        break ZXC;
                    case 4:
                        roomStandard = "4 star";
                        break ZXC;
                    case 5:
                        roomStandard = "5 star";
                        break ZXC;
                    default:
                        System.out.println("please re-Room Standard enter (Nhập lại tiêu chuẩn phòng)");
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("please re-Room Standard enter (Nhập lại tiêu chuẩn phòng)");
            }

        } while (true);

        //================================================================
        double poolArea;
        while (true) {
            try {
                System.out.println("Pool area enter (Nhập diện tích hồ bơi)");
                poolArea = Double.parseDouble(sc.nextLine());
                if (poolArea < 30) {
                    System.out.println("Pool area must be more than 30 square meters (Diện tích hồ bơi phải trên 30 met vuông)");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-Pool area enter (Nhập lại diện tích hồ bơi)");
            }
        }

        //==============================================================
        int numberOfFloors;
        while (true) {
            try {
                System.out.println("Number Of Floors enter");
                numberOfFloors = Integer.parseInt(sc.nextLine());
                if (numberOfFloors > 0) {
                    break;
                } else {
                    System.out.println("the number of floors must be greater than 0 (Số tầng phải lớn hơn 0)");
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-Number Of Floors enter");
            }

        }


        Villa villa = new Villa(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, poolArea, numberOfFloors);
        return villa;
    }

    public static String getInfoVilla(Villa villa) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", villa.getServiceName(), villa.getUsableArea(), villa.getRentalCosts(), villa.getMaximumNumberOfPeople(), villa.getRentalType(), villa.getRoomStandard(), villa.getPoolArea(), villa.getNumberOfFloors());
    }

    public House infoHouse() {
        String serviceName;
        while (true) {
            System.out.println("Service ID enter, ex:SV-HO0123 (Nhập mã dịch vụ, vd: SV-VL0123)");
            serviceName = sc.nextLine();
            if (serviceName.matches("SV-HO[0-9]{4}")) {
                break;
            } else {
                System.out.println("please re-Service ID enter (Nhập lại mã dịch vụ)");
            }
        }
        //================================================================
        double usableArea;
        while (true) {
            try {
                System.out.println("Usable Area enter (Nhập diện tích sử dụng)");
                usableArea = Double.parseDouble(sc.nextLine());
                if (usableArea <= 30) {
                    System.out.println("please re-area enter > 30 ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-area number");
            }
        }

        //===============================================================
        double rentalCosts;
        while (true) {
            try {
                System.out.println("Rental Costs enter (Nhập chi phí thuê)");
                rentalCosts = Double.parseDouble(sc.nextLine());
                if (rentalCosts <= 0) {
                    System.out.println("please re-rental cost enter (Nhập lại chi phí thuê)");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-rental cost enter (Nhập lại chi phí thuê)");
            }
        }

        //===============================================================
        int maximumNumberOfPeople;
        while (true) {
            try {
                System.out.println("Maximum Number Of People enter (Nhập số lượng người tối đa)");
                maximumNumberOfPeople = Integer.parseInt(sc.nextLine());
                if (maximumNumberOfPeople > 20 || maximumNumberOfPeople < 0) {
                    System.out.println("Number of people enter > 0 and <20");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-Maximum Number Of People enter (Nhập lại số lượng người tối đa)");
            }
        }

        //=================================================================
        String rentalType;
        int chooseRentalType;
        RTT:
        do {
            try {
                System.out.println("Rental Type enter (Nhập kiểu thuê)\n1.Year (Năm)\n2. Month(Tháng)\n3. Day (Ngày)\n4. Hours (Giờ)");
                chooseRentalType = Integer.parseInt(sc.nextLine());
                switch (chooseRentalType) {
                    case 1:
                        rentalType = "Year";
                        break RTT;
                    case 2:
                        rentalType = "Month";
                        break RTT;
                    case 4:
                        rentalType = "Day";
                        break RTT;
                    case 3:
                        rentalType = "Hours";
                        break RTT;
                    default:
                        System.out.println("Please re-Rental Type enter");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please re-Rental Type enter");
            }


        } while (true);
//===================================================
        int chooseRoomStandard;
        String roomStandard;
        ZXC:
        do {
            try {
                System.out.println(" (nhập tiêu chuẩn phòng\n1. 1 star\n2. 2 star\n3. 3 star\n4. 4 star\n5. 5 star)");
                chooseRoomStandard = Integer.parseInt(sc.nextLine());
                switch (chooseRoomStandard) {
                    case 1:
                        roomStandard = "1 star";
                        break ZXC;
                    case 2:
                        roomStandard = "2 star";
                        break ZXC;
                    case 3:
                        roomStandard = "3 star";
                        break ZXC;
                    case 4:
                        roomStandard = "4 star";
                        break ZXC;
                    case 5:
                        roomStandard = "5 star";
                        break ZXC;
                    default:
                        System.out.println("please re-Room Standard enter (Nhập lại tiêu chuẩn phòng)");
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("please re-Room Standard enter (Nhập lại tiêu chuẩn phòng)");
            }

        } while (true);
        //=============================================
        int numberOfFloors;
        while (true) {
            try {
                System.out.println("Number Of Floors enter");
                numberOfFloors = Integer.parseInt(sc.nextLine());
                if (numberOfFloors > 0) {
                    break;
                } else {
                    System.out.println("the number of floors must be greater than 0 (Số tầng phải lớn hơn 0)");
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-Number Of Floors enter");
            }

        }
        //=======================================

        House house = new House(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);
        return house;
    }

    public static String getInfoHouse(House house) {
        return String.format("%s,%s,%s,%s,%s,%s,%s", house.getServiceName(), house.getUsableArea(), house.getRentalCosts(), house.getMaximumNumberOfPeople(), house.getRentalType(), house.getRoomStandard(), house.getNumberOfFloors());
    }

    public Room infoRoom() {
        String serviceName;
        while (true) {
            System.out.println("Service ID enter, ex:SV-RO1234 (Nhập mã dịch vụ, vd: SV-RO1234)");
            serviceName = sc.nextLine();
            if (serviceName.matches("SV-RO[0-9]{4}")) {
                break;
            } else {
                System.out.println("please re-Service ID enter (Nhập lại mã dịch vụ)");
            }
        }
        //================================================================
        double usableArea;
        while (true) {
            try {
                System.out.println("Usable Area enter (Nhập diện tích sử dụng)");
                usableArea = Double.parseDouble(sc.nextLine());
                if (usableArea <= 30) {
                    System.out.println("please re-area enter > 30 ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-area number");
            }
        }

        //===============================================================
        double rentalCosts;
        while (true) {
            try {
                System.out.println("Rental Costs enter (Nhập chi phí thuê)");
                rentalCosts = Double.parseDouble(sc.nextLine());
                if (rentalCosts <= 0) {
                    System.out.println("please re-rental cost enter (Nhập lại chi phí thuê)");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-rental cost enter (Nhập lại chi phí thuê)");
            }
        }

        //===============================================================
        int maximumNumberOfPeople;
        while (true) {
            try {
                System.out.println("Maximum Number Of People enter (Nhập số lượng người tối đa)");
                maximumNumberOfPeople = Integer.parseInt(sc.nextLine());
                if (maximumNumberOfPeople > 20 || maximumNumberOfPeople < 0) {
                    System.out.println("Number of people enter > 0 and <20");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please re-Maximum Number Of People enter (Nhập lại số lượng người tối đa)");
            }
        }

        //=================================================================
        String rentalType;
        int chooseRentalType;
        RTT:
        do {
            try {
                System.out.println("Rental Type enter (Nhập kiểu thuê)\n1.Year (Năm)\n2. Month(Tháng)\n3. Day (Ngày)\n4. Hours (Giờ)");
                chooseRentalType = Integer.parseInt(sc.nextLine());
                switch (chooseRentalType) {
                    case 1:
                        rentalType = "Year";
                        break RTT;
                    case 2:
                        rentalType = "Month";
                        break RTT;
                    case 4:
                        rentalType = "Day";
                        break RTT;
                    case 3:
                        rentalType = "Hours";
                        break RTT;
                    default:
                        System.out.println("Please re-Rental Type enter");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please re-Rental Type enter");
            }


        } while (true);
        //==============================================================
        int chooseServiceFree;
        String serviceFree;
        yassuo:
        while (true){
            try {
                System.out.println("Service free enter (dịch vụ miễn phí đi kèm)\n1. Massage\n2. Karaoke massage\n3. Dinner massage");
                chooseServiceFree = Integer.parseInt(sc.nextLine());
                switch (chooseServiceFree){
                    case 1:
                        serviceFree = "Massage";
                        break yassuo;
                    case 2:
                        serviceFree = "Karaoke massage";
                        break yassuo;
                    case 3:
                        serviceFree = "Dinner massage";
                        break yassuo;
                    default:
                        System.out.println("please re-Service free enter (Nhập lại dịch vụ miễn phí đi kèm)");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("please re-Service free enter (Nhập lại dịch vụ miễn phí đi kèm)");
            }

        }

        //============================================================
        Room room = new Room(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, serviceFree);
        return room;
    }

    public static String getInfoRoom(Room room) {
        return String.format("%s,%s,%s,%s,%s,%s", room.getServiceName(), room.getUsableArea(), room.getRentalCosts(), room.getMaximumNumberOfPeople(), room.getRentalType(), room.getFreeService());

    }

}
