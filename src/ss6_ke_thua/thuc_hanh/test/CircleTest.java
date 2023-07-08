package ss6_ke_thua.thuc_hanh.test;

import ss6_ke_thua.thuc_hanh.shape.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5,"indigo",false);
    }
}
