package ss4_class_object.bai_tap.bai_tap;

import java.util.Scanner;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    int speed = SLOW;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public Fan() {

    }

    private Fan(int speed, double radius, boolean on, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    private int getSpeed() {
        return this.speed;
    }


    private void setSpeed(int speed) {
        this.speed = speed;
    }

    private boolean isOn() {
        return this.on;
    }

    private void setOn(boolean on) {
        this.on = on;
    }

    private double getRadius() {
        return this.radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    private String getColor() {
        return this.color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private boolean turnOn() {
        this.on = true;
        return this.on;
    }

    private boolean turnOff() {
        this.on = false;
        return this.on;
    }


    public String toString() {
        if (this.on == true) {
            return "tốc độ quạt: " + this.speed + "\n màu: " + this.color + "\n bán kính: " + this.radius + "\n quạt đang bật";
        } else {
            return "quạt đang tắt";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào để xem: ");
        String check = scanner.nextLine();
        Fan fan1 = new Fan(FAST, 10, true, "yellow");
        Fan fan2 = new Fan(MEDIUM, 5, false, "blue");
        Fan fan3 = new Fan();
        if (check.equals("fan1")) {
            System.out.println(fan1.toString());
            System.out.println("Bấm để tắt quạt");
            String off = scanner.nextLine();
            fan1.on = fan1.turnOff();
            System.out.println(fan1.toString());
        } else if (check.equals("fan2")) {
            System.out.println(fan2.toString());
            System.out.println("Bấm để bật quạt");
            String on = scanner.nextLine();
            fan2.on = fan2.turnOn();
            System.out.println(fan2.toString());
        } else {
            System.out.println(fan3.toString());
        }
    }
}
