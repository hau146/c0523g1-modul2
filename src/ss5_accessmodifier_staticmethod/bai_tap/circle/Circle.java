package ss5_accessmodifier_staticmethod.bai_tap.circle;

import java.awt.geom.Area;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * 2 * Math.PI;
    }


}
