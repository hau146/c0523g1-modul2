package case_tudy.service.booking;

import case_tudy.model.event.Booking;
import case_tudy.model.event.Contract;
import case_tudy.model.facility.Facility;
import case_tudy.repository.booking.BookingRepository;
import case_tudy.repository.booking.IBookingRepository;
import case_tudy.repository.customer.CustomerRepository;
import case_tudy.repository.customer.ICustomerRepository;
import case_tudy.repository.facility.FacilityRepository;
import case_tudy.repository.facility.IFacilityRepository;
import case_tudy.service.customer.CustomerService;
import case_tudy.service.customer.ICustomerService;
import case_tudy.service.facility.FacilityService;
import case_tudy.service.facility.IFacilityService;
import case_tudy.service.format.Treatment;

import java.time.LocalDate;
import java.util.*;

public class BookingService implements IBookingService {
    IBookingRepository bookingRepository = new BookingRepository();
    IFacilityRepository facilityRepository = new FacilityRepository();
    IFacilityService facilityService = new FacilityService();
    ICustomerService customerService = new CustomerService();
    ICustomerRepository customerRepository = new CustomerRepository();
    static Scanner scanner = new Scanner(System.in);
    Map<Facility, Integer> myMap = new TreeMap<>();
    List<Facility> facilityList = new ArrayList<>();
    Queue<Booking> queue = new ArrayDeque<>();
    String getIdBooking = "";
    List<String> stringList = new ArrayList<>();


    @Override
    public void displayBooking() {
        List<Booking> bookingList = bookingRepository.finAllBooking();
        if (facilityList.size() == 0 && bookingList.size() == 0) {
            System.err.println("Hiện tại không có dịch vụ nào được booking !");
        } else {
            System.out.println("\n---Danh sách dịch vụ---");
            for (Facility facility : facilityList) {
                System.out.println(facility);
            }
            System.out.println("Đã được booking bởi khách hàng có :");
            for (Booking booking : bookingList) {
                System.out.println(booking);
            }
        }
        System.out.println("---------------------");
    }

    public void displayContract() {
        List<Contract> contractList = bookingRepository.finALlContract();
        if (contractList.size() == 0) {
            System.err.println("Chưa có ai tạo hợp đồng !");
        } else {
            System.out.println("Mã Booking : " + getIdBooking + " có hợp đồng : ");
            for (Contract contract : contractList) {
                System.out.println(contract);
            }
        }
    }

    @Override
    public void addBooking() {
        System.out.println("---Khách hàng hiện có---");
        customerService.displayCustomer();
        System.out.println("\n---Mời bạn chọn các dịch vụ dưới đây---");
        facilityService.displayFacility();
        while (true) {
            System.out.println("\n---Nhập theo id để chọn dịch vụ---");
            String idService = scanner.nextLine();
            Facility key = facilityRepository.searchKey(idService);
            System.out.println("\n---Nhập id khách muốn booking---");
            String idCustomer = scanner.nextLine();
            int index = customerRepository.searchIndex(idCustomer);
            if (key == null) {
                System.err.println(">Không có dịch vụ này !<");
            } else if (index == -1) {
                System.err.println(">Không có id khách này để booking !<");
            } else {
//                facilityTreeSet.add(key);
//                myMap.put(key, bookingRepository.numberBooking());
                for (Booking str : queue) {
                    if (str.equals(idCustomer)) {
                        System.err.println("Khách hàng này đã booking rồi !\n");
                        return;
                    }
                }
                bookingRepository.addBooking(key, bookingRepository.numberBooking());
                facilityList.add(key);
//                queue.add(idCustomer);
                System.out.println("\n---Nhập ngày booking !---");
                LocalDate dateBooking = LocalDate.parse(scanner.nextLine());
//                dateBooking = CheckErr.checkDate(inputBooking, dateBooking);

                System.out.println("\n---Nhập ngày bắt đầu thuê !---");
                LocalDate starDate = LocalDate.parse(scanner.nextLine());
//                starDate = CheckErr.checkDate(inputStartDate, starDate);

                System.out.println("\n---Nhập ngày kết thúc thuê !---");
                LocalDate endDate = LocalDate.parse(scanner.nextLine());
//                endDate = CheckErr.checkDate(intputEndDate, endDate);

                System.out.println("\nBooking thành công !");
                System.out.println("Mã booking của bạn là : " + Treatment.treatment(dateBooking, idCustomer));
                String idBooking = Treatment.treatment(dateBooking, idCustomer);
                getIdBooking = idBooking;
                stringList.add(idBooking);
                Booking booking = new Booking(idBooking, dateBooking, starDate, endDate, idCustomer, key.getIdService());
                bookingRepository.addServiceBooking(booking);
                break;
            }
        }
    }

    @Override
    public void newContracts() {
        List<Booking> bookingList = bookingRepository.finAllBooking();
        System.out.println("\n---Các khách hàng đã booking dịch vụ !---");
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
        while (true) {
            System.out.println("\nNhập vào mã khách hàng để tạo hợp đồng");
            String idCustomer = scanner.nextLine();
            int index = bookingRepository.searchIndex(idCustomer);
            if (index == -1) {
                System.err.println(">Không có id khách này để tạo hợp đồng !<");
            } else {
                System.out.println("Nhập vào số hợp đồng");
                int contracts = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tiền đã cọc trước");
                int moneyDeposit = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tổng tiền đã thanh toán xong !");
                int moneyPayments = Integer.parseInt(scanner.nextLine());
                Contract contract = new Contract(contracts, moneyDeposit, moneyPayments);
                bookingRepository.addContracts(contract);
                System.out.println("---Tạo hợp đồng thành công !---");
                break;
            }
        }
    }

    @Override
    public void editContracts() {
        displayContract();
        while (true) {
            System.out.println("\n---Nhập vào mã booking để sửa hợp đồng !---");
            String editById = scanner.nextLine();
            int index = -1;
            for (int i = 0; i < stringList.size(); i++) {
                if (editById.equals(stringList.get(i))) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("Có hợp đồng này đâu mà sửa !");
            } else {
                System.out.println("Nhập lai số hợp đồng để sửa :");
                int editContracts = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập lại tiền cọc để sửa : ");
                int editMoneyDeposit = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập lại tiền thanh toán để sửa : ");
                int editMoneyPayments = Integer.parseInt(scanner.nextLine());
                Contract contract = new Contract(editContracts, editMoneyDeposit, editMoneyPayments);
                bookingRepository.editContracts(index, contract);
                System.out.println("\n---Sửa thành côngg !");
                break;
            }
        }
    }
}
