package case_tudy.repository.facility;

import case_tudy.model.facility.Facility;
import case_tudy.model.facility.House;
import case_tudy.model.facility.Room;
import case_tudy.model.facility.Villa;

import java.util.AbstractList;
import java.util.LinkedHashMap;

public interface IFacilityRepository {
    LinkedHashMap<Villa,Integer> finAllVilla();
    LinkedHashMap<House,Integer> finAllHouse();
    LinkedHashMap<Room,Integer> finAllRoom();
    LinkedHashMap<Facility,Integer> finAllFacility();
    void addVilla(Villa villa,Integer integer);
    void addHouse (House house,Integer integer);
    void addRoom(Room room,Integer integer);
    LinkedHashMap<Facility,Integer> finAllMaintenance();
    void deleteVilla(Villa id);
    void deleteHouse(House key);
    void deleteRoom(Room key);
    void deleteFacility(Facility key);
    Facility searchKey(String id);
}
