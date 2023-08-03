package test.test_case_tudy.repository.facility;

import case_tudy.model.facility.House;
import case_tudy.model.facility.Room;
import case_tudy.model.facility.Villa;

import java.util.LinkedHashMap;

public interface IFacilityRepository {
    LinkedHashMap<Villa,Integer> finAllVilla();
    LinkedHashMap<House,Integer> finAllHouse();
    LinkedHashMap<Room,Integer> finAllRoom();
    void addVilla(Villa villa,Integer integer);
    void addHouse (House house,Integer integer);
    void addRoom(Room room,Integer integer);
}
