package ss6_ke_thua.bai_tap.circle_and_cylinder;

public class Circle {
    protected double radius = 2.0;
    protected String color = "red";

    protected Circle() {
    }

    protected Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Một vòng tròn có bán kính= " + getRadius() + " diện tích= " + getArea() + ", là một lớp cha của " + super.toString();
    }
}
