package ss5_accessmodifier_staticmethod.bai_tap.circle;

import java.awt.geom.Area;

public class Circle {
    static final double pi = 3.14;
    double radius = 1.0;
    String color = "red";

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * 2 * pi;
    }


}
