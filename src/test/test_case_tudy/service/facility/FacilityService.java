package test.test_case_tudy.service.facility;

import case_tudy.model.facility.House;
import case_tudy.model.facility.Room;
import case_tudy.model.facility.Villa;
import case_tudy.repository.facility.FacilityRepository;
import case_tudy.repository.facility.IFacilityRepository;
import case_tudy.service.facility.IFacilityService;
import case_tudy.service.format.CheckErr;
import case_tudy.service.format.CheckErrorOccurs;
import case_tudy.service.format.CheckRegex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    IFacilityRepository facilityRepository = new FacilityRepository();
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayFacility() {
        LinkedHashMap<Villa, Integer> villaLinkedHashMap = facilityRepository.finAllVilla();
        System.out.println("\n---List of villas---");
        for (Map.Entry<Villa, Integer> villaEntry : villaLinkedHashMap.entrySet()) {
            System.out.println(villaEntry.getKey() + " - " + villaEntry.getValue());
        }

        LinkedHashMap<House, Integer> houseLinkedHashMap = facilityRepository.finAllHouse();
        System.out.println("\n---List of houses---");
        for (Map.Entry<House, Integer> houseEntry : houseLinkedHashMap.entrySet()) {
            System.out.println(houseEntry.getKey() + " - " + houseEntry.getValue());
        }

        LinkedHashMap<Room, Integer> roomLinkedHashMap = facilityRepository.finAllRoom();
        System.out.println("\n---List of rooms---");
        for (Map.Entry<Room, Integer> roomEntry : roomLinkedHashMap.entrySet()) {
            System.out.println(roomEntry.getKey() + " - " + roomEntry.getValue());
        }
    }

    @Override
    public void addVilla() {
        boolean flag = true;
        String inputId = "Enter the villa's ID with the format (SVVL-YYYY) : ";
        String idVilla = null;
        idVilla = CheckErr.checkIdVilla(inputId, CheckErrorOccurs.ERR_ID, idVilla, flag);

        String inputName = "Enter the name Villa for rent : ";
        String nameVilla = null;
        nameVilla = CheckErr.checkName(inputName, CheckErrorOccurs.ERR_NAME, nameVilla, flag);

        String inputArea = "Enter the villa area (> 30m^2)";
        double areaVilla = 0.0d;
        areaVilla = CheckErr.checkArea(inputArea, CheckErrorOccurs.ERR_AREA, areaVilla);

        String inputPrice = "Enter the cost of renting a villa : ";
        int priceVilla = 0;
        priceVilla = CheckErr.checkPrice(inputPrice, CheckErrorOccurs.ERR_PRICE, priceVilla);

        String inputNumPerson = "Enter the number of villas tenants";
        int numPersonVilla = 0;
        numPersonVilla = CheckErr.checkNumberPerson(inputNumPerson, CheckErrorOccurs.ERR_NUM_PERSON, numPersonVilla);

        String inputDateHire = "Enter the rental type";
        String dateHireVilla = null;
        dateHireVilla = CheckErr.checkName(inputDateHire, CheckErrorOccurs.ERR_NAME, dateHireVilla, flag);

        String inputRoomStandard = "Enter room standard : ";
        String roomStandardVilla = null;
        roomStandardVilla = CheckErr.checkName(inputRoomStandard, CheckErrorOccurs.ERR_NAME, roomStandardVilla, flag);

        String inputareaPool = "Enter the pool area : ";
        double areaPoolVilla = 0.0d;
        areaPoolVilla = CheckErr.checkArea(inputareaPool, CheckErrorOccurs.ERR_POOL_AREA, areaPoolVilla);

        String inputFloor = "Enter the number of villas : ";
        int floorVilla = 0;
        floorVilla = CheckErr.checkPrice(inputFloor, CheckErrorOccurs.ERR_FLOORS, floorVilla);

        Villa villa = new Villa(idVilla, nameVilla, areaVilla, priceVilla, numPersonVilla, dateHireVilla, roomStandardVilla, areaPoolVilla, floorVilla);
        facilityRepository.addVilla(villa, 0);
        System.out.println("Add successful villa service !\n");
    }

    @Override
    public void addHouse() {
        boolean flag = true;
        String inputId = "Enter the house's ID with the format (SVHO-YYYY) : ";
        String idHouse = null;
        idHouse = CheckErr.checkIdHouse(inputId, CheckErrorOccurs.ERR_ID, idHouse, flag);

        String inputName = "Enter the name house for rent : ";
        String nameHouse = null;
        nameHouse = CheckErr.checkName(inputName, CheckErrorOccurs.ERR_NAME, nameHouse, flag);

        String inputArea = "Enter the house area (> 30m^2)";
        double areaHouse = 0.0d;
        areaHouse = CheckErr.checkArea(inputArea, CheckErrorOccurs.ERR_AREA, areaHouse);

        String inputPrice = "Enter the cost of renting a house : ";
        int priceHouse = 0;
        priceHouse = CheckErr.checkPrice(inputPrice, CheckErrorOccurs.ERR_PRICE, priceHouse);

        String inputNumPerson = "Enter the number of houses tenants";
        int numPersonHouse = 0;
        numPersonHouse = CheckErr.checkNumberPerson(inputNumPerson, CheckErrorOccurs.ERR_NUM_PERSON, numPersonHouse);

        String inputDateHire = "Enter the rental type";
        String dateHireHouse = null;
        dateHireHouse = CheckErr.checkName(inputDateHire, CheckErrorOccurs.ERR_NAME, dateHireHouse, flag);

        String inputRoomStandard = "Enter room standard : ";
        String roomStandardHouse = null;
        roomStandardHouse = CheckErr.checkName(inputRoomStandard, CheckErrorOccurs.ERR_NAME, roomStandardHouse, flag);

        String inputFloor = "Enter the number of villas : ";
        int floorHouse = 0;
        floorHouse = CheckErr.checkPrice(inputFloor, CheckErrorOccurs.ERR_FLOORS, floorHouse);

        House house = new House(idHouse, nameHouse, areaHouse, priceHouse, numPersonHouse, dateHireHouse, roomStandardHouse, floorHouse);
        facilityRepository.addHouse(house, 0);
        System.out.println("Add successful house service !\n");
    }

    @Override
    public void addRoom() {
        boolean flag = true;
        String inputId = "Enter the Room's ID with the format (SVRO-YYYY) : ";
        String idRoom = null;
        idRoom = CheckErr.checkIdRoom(inputId, CheckErrorOccurs.ERR_ID, idRoom, flag);

        String inputName = "Enter the name room for rent : ";
        String nameRoom = null;
        nameRoom = CheckErr.checkName(inputName, CheckErrorOccurs.ERR_NAME, nameRoom, flag);

        String inputArea = "Enter the room area (> 30m^2)";
        double areaRoom = 0.0d;
        areaRoom = CheckErr.checkArea(inputArea, CheckErrorOccurs.ERR_AREA, areaRoom);

        String inputPrice = "Enter the cost of renting a room : ";
        int priceRoom = 0;
        priceRoom = CheckErr.checkPrice(inputPrice, CheckErrorOccurs.ERR_PRICE, priceRoom);

        String inputNumPerson = "Enter the number of rooms tenants";
        int numPersonRoom = 0;
        numPersonRoom = CheckErr.checkNumberPerson(inputNumPerson, CheckErrorOccurs.ERR_NUM_PERSON, numPersonRoom);

        String inputDateHire = "Enter the rental type";
        String dateHireRoom = null;
        dateHireRoom = CheckErr.checkName(inputDateHire, CheckErrorOccurs.ERR_NAME, dateHireRoom, flag);

        System.out.println("Enter the accompanying service : ");
        String roomStandardRoom = scanner.nextLine();


        Room room = new Room(idRoom, nameRoom, areaRoom, priceRoom, numPersonRoom, dateHireRoom, roomStandardRoom);
        facilityRepository.addRoom(room, 0);
        System.out.println("Add successful room service !\n");
    }

    @Override
    public void finAllMaintenance() {

    }

    @Override
    public void deleteFacility() {

    }
}
