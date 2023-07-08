package ss6_ke_thua.bai_tap.circle_and_cylinder;

import ss6_ke_thua.bai_tap.circle_and_cylinder.Circle;

public class TestCircle extends Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.0, "white");
        System.out.println(circle);
    }
}
