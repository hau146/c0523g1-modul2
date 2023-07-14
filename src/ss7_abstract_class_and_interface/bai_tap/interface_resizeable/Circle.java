package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Circle extends Shape implements Resizeable {
    public double radius = 1.0;

    public Circle() {
    }

    public Circle(double radisu) {
        this.radius = radisu;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radisu) {
        this.radius = radisu;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", which is a subclass of " + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * Math.sqrt(percent + 1);
    }
}
