package ss4_class_object.bai_tap.bai_tap;

import java.util.Date;
public class Timer {
    private Date startTime;
    public Timer() {
        startTime = new Date();
    }
    public void reset() {
        startTime = new Date();
    }
    public Date getStartTime() {
        return startTime;
    }
    // Các phương thức khác của lớp Timer...
    public static void main(String[] args) {
        Timer timer = new Timer();
        System.out.println("Thời gian bắt đầu: " + timer.getStartTime());
// Reset thời gian
        timer.reset();
        System.out.println("Thời gian đã reset: " + timer.getStartTime());
    }
}
