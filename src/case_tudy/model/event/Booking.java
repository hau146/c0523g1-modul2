package case_tudy.model.event;

import java.time.LocalDate;

public class Booking {
    private String idBooking;
    private LocalDate dateBooking;
    private LocalDate startDate;
    private LocalDate endDate;
    private String idCustomer;
    private String idService;

    public Booking() {
    }

    public Booking(String idBooking, LocalDate dateBooking, LocalDate startDate, LocalDate endDate, String idCustomer, String idService) {
        this.idBooking = idBooking;
        this.dateBooking = dateBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public LocalDate getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(LocalDate dateBooking) {
        this.dateBooking = dateBooking;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Mã Booking :'" + idBooking + '\'' +
                ", Ngày booking : " + dateBooking +
                ", Ngày bắt đầu thuê :" + startDate +
                ", Ngày kết thúc thuê :" + endDate +
                ", Mã khách hàng :'" + idCustomer + '\'' +
                ", Mã dịch vụ :'" + idService + '\'';
    }
}
