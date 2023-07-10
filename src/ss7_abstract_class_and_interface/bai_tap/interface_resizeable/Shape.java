package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Shape implements Resizeable {
    protected String color = "green";
    protected boolean filled = true;
    protected double size;

    protected Shape() {
    }

    public Shape(String color, boolean filled, double size) {
        this.color = color;
        this.filled = filled;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        System.out.println();

        shape = new Shape("black", false, 70);
        System.out.println(shape);
    }

    @Override
    public void resize(double percent) {

    }
}
