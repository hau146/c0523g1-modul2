package case_tudy.repository.booking;

import case_tudy.model.event.Booking;
import case_tudy.model.event.Contract;
import case_tudy.model.facility.Facility;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;

public interface IBookingRepository {
    List<Booking> finAllBooking();
    List<Contract> finALlContract();
    void addBooking(Facility facility,Integer integer);
    void addContracts(Contract contract);
    void editContracts(int index, Contract contract);
    LinkedHashMap<Facility, Integer> facility();
    int numberBooking();
    void addServiceBooking(Booking booking);
    int searchIndex(String id);

}
