package ss5_accessmodifier_staticmethod.bai_tap.circle;

import java.awt.geom.Area;

public class Circle {
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

    public String getColor() {
        return color;
    }


}
