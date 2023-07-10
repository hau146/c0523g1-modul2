package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Circle extends Shape implements Resizeable {
    public double radius = 1.0;

    public Circle() {
    }

    public Circle(double radisu) {
        this.radius = radisu;
    }

    public Circle(double radius, String color, boolean filled, double size) {
        super(color, filled, size);
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
                ", size=" + size +
                ", which is a subclass of " + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
//        this.size = this.radius / (Math.pow((1 + percent), 1 / 2));
        this.size = this.radius * percent;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle + "\n");

        circle = new Circle(3.5);
        System.out.println(circle + "\n");

        circle = new Circle(3.5, "red", true, 30);
        System.out.println(circle);

        circle.resize(0.1);
    }


}
