package case_tudy.comparator;

import case_tudy.model.event.Booking;
import case_tudy.service.format.Treatment;

import java.util.Comparator;

public class SortEndDate implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return Treatment.treatment(o1.getEndDate()) - Treatment.treatment(o2.getEndDate());
    }
}
