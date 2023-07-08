package ss6_ke_thua.bai_tap.circle_and_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Circle circle = new Cylinder();
        System.out.println(circle);
        System.out.println();

        circle = new Cylinder(7.0);
        System.out.println(circle);
        System.out.println();

        circle = new Cylinder(10.0, 7.2, "blue");
        System.out.println(circle);
    }
}
