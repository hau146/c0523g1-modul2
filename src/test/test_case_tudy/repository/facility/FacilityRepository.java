package test.test_case_tudy.repository.facility;

import case_tudy.model.facility.Facility;
import case_tudy.model.facility.House;
import case_tudy.model.facility.Room;
import case_tudy.model.facility.Villa;
import case_tudy.repository.facility.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static LinkedHashMap<Facility, Integer> facilityLinkedHashMap = new LinkedHashMap<>();

    static {
        Villa villa1 = new Villa("SVVL-0001", "Luxury villa", 500, 20000, 10, "Day", "Vip", 80, 3);
        Villa villa2 = new Villa("SVVL-0002", "Magical villa", 400, 17000, 4, "Month", "Magic", 45, 2);
        House house1 = new House("SVHO-0001", "Street house", 200, 10000, 2, "Hour", "Premium", 2);
        House house2 = new House("SVHO-0002", "Ordinary house", 100, 9000, 1, "Hour", "Normal", 1);
        Room room1 = new Room("SVRO-0001", "Genuine room", 50, 5000, 3, "Day", "Relax");
        Room room2 = new Room("SVRO-0002", "Chill room", 40, 7000, 6, "Month", "DJ");
        facilityLinkedHashMap.put(villa1, 0);
        facilityLinkedHashMap.put(villa2, 0);
        facilityLinkedHashMap.put(house1, 0);
        facilityLinkedHashMap.put(house2, 0);
        facilityLinkedHashMap.put(room1, 0);
        facilityLinkedHashMap.put(room2, 0);
    }

    @Override
    public LinkedHashMap<Villa, Integer> finAllVilla() {
        LinkedHashMap<Villa, Integer> villaLinkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> entry : facilityLinkedHashMap.entrySet()) {
            if (entry.getKey() instanceof Villa) {
                villaLinkedHashMap.put((Villa) entry.getKey(), entry.getValue());
            }
        }
        return villaLinkedHashMap;
    }

    @Override
    public LinkedHashMap<House, Integer> finAllHouse() {
        LinkedHashMap<House, Integer> houseLinkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> entry : facilityLinkedHashMap.entrySet()) {
            if (entry.getKey() instanceof House) {
                houseLinkedHashMap.put((House) entry.getKey(), entry.getValue());
            }
        }
        return houseLinkedHashMap;
    }

    @Override
    public LinkedHashMap<Room, Integer> finAllRoom() {
        LinkedHashMap<Room, Integer> roomLinkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> entry : facilityLinkedHashMap.entrySet()) {
            if (entry.getKey() instanceof Room) {
                roomLinkedHashMap.put((Room) entry.getKey(), entry.getValue());
            }
        }
        return roomLinkedHashMap;
    }

    @Override
    public void addVilla(Villa villa, Integer integer) {
        facilityLinkedHashMap.put(villa, integer);
    }

    @Override
    public void addHouse(House house, Integer integer) {
        facilityLinkedHashMap.put(house, integer);

    }

    @Override
    public void addRoom(Room room, Integer integer) {
        facilityLinkedHashMap.put(room, integer);
    }

    @Override
    public LinkedHashMap<Facility, Integer> finAllMaintenance() {
        return null;
    }

    @Override
    public void deleteVilla(Villa id) {

    }

    @Override
    public void deleteHouse(House key) {

    }

    @Override
    public void deleteRoom(Room key) {

    }

    @Override
    public void deleteFacility(Facility key) {

    }

    @Override
    public Facility searchKey(String id) {
        return null;
    }
}
