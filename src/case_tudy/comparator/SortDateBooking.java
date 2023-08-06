package case_tudy.comparator;

import case_tudy.model.event.Booking;
import case_tudy.service.format.Treatment;

import java.util.Comparator;

public class SortDateBooking implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        return Treatment.treatment(o1.getDateBooking()) - Treatment.treatment(o2.getDateBooking());
    }
}
