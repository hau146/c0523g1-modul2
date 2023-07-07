package ss4_class_object.bai_tap.bai_tap;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    long startTime;
    long endTime;
    Date star;
    Date end;

    private StopWatch() {
        startTime = System.currentTimeMillis();
    }

    private StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    private long getStartTime() {
        return startTime;
    }

    private long getEndTime() {
        return endTime;
    }

    private void start() {
        this.star = new Date();
        long h = star.getHours();
        long m = star.getMinutes();
        long s = star.getSeconds();
        this.startTime = System.currentTimeMillis();
        System.out.println("Thời gian bắt đầu là: " + h + "h " + m + "m " + s + "s");

    }

    private void stop() {
        this.end = new Date();
        long h = end.getHours();
        long m = end.getMinutes();
        long s = end.getSeconds();
        this.endTime = System.currentTimeMillis();
        System.out.println("Thời gian kết thúc là: " + h + "h " + m + "m " + s + "s");
    }

    private long getElapsedTime() {
        long time = this.endTime - this.startTime;
        return time;
    }

    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("bấm enter để bắt đầu");
        String start = scanner.nextLine();
        time.start();
        System.out.println("bấm enter để kết thúc");
        String stop = scanner.nextLine();
        time.stop();
        System.out.println("thời gian đã trôi qua: " + time.getElapsedTime() + " milisecond giây");

    }
}
