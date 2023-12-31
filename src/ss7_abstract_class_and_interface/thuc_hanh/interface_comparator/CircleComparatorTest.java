package ss7_abstract_class_and_interface.thuc_hanh.interface_comparator;

import ss6_ke_thua.thuc_hanh.shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Đã sắp xếp truớc:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("Sau khi sắp xếp");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
