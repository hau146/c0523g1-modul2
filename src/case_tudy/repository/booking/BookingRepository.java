package case_tudy.repository.booking;

import case_tudy.comparator.SortDateBooking;
import case_tudy.model.event.Booking;
import case_tudy.model.event.Contract;
import case_tudy.model.facility.Facility;
import case_tudy.repository.facility.FacilityRepository;
import case_tudy.repository.facility.IFacilityRepository;


import java.util.*;


public class BookingRepository implements IBookingRepository {
    IFacilityRepository facilityRepository = new FacilityRepository();
    List<Booking> bookingList = new ArrayList<>();
    List<Contract> contractList = new ArrayList<>();
    int count = 0;


    @Override
    public List<Booking> finAllBooking() {
        SortDateBooking sort = new SortDateBooking();
        Collections.sort(bookingList, sort);
        return bookingList;
    }

    @Override
    public List<Contract> finALlContract() {
        return contractList;
    }


    @Override
    public void addBooking(Facility facility, Integer integer) {
        LinkedHashMap<Facility, Integer> facilityLinkedHashMap = this.facility();
        facilityLinkedHashMap.put(facility, integer);
        facilityRepository.finAllFacility().putAll(facilityLinkedHashMap);
    }

    @Override
    public void addServiceBooking(Booking booking) {
        bookingList.add(booking);
    }

    @Override
    public void addContracts(Contract contract) {
        contractList.add(contract);
    }

    @Override
    public void editContracts(int index, Contract contract) {
        contractList.set(index, contract);
    }

    @Override
    public LinkedHashMap<Facility, Integer> facility() {
        return facilityRepository.finAllFacility();
    }

    @Override
    public int numberBooking() { //hàm này tạo ra để đếm số lần booking
        count += 1;
        return count;
    }

    @Override
    public int searchIndex(String id) {
        List<Booking> customerList = this.finAllBooking();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
