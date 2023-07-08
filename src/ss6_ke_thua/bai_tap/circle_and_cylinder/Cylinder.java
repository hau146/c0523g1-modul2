package ss6_ke_thua.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    protected double height = 5.0;

    protected Cylinder() {


    }

    protected Cylinder(double height) {
        this.height = height;
    }

    protected Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double urinationArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double volume() {
        return this.urinationArea() * this.height;
    }

    @Override
    public String toString() {
        return "Một hình trụ có chiều cao= " + getHeight() + ", bán kính đáy= " + urinationArea() + "\nThể tích hình trụ= " + this.volume() + "\nlà một lớp con của Cicrle " + super.toString();
    }
}
