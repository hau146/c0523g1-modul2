package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 4;
    private double height = 6;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, String color, boolean filled, double size) {
        super(color, filled, size);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", filled=" + filled + ", which is a subclass of " + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.size = this.width * this.height * percent;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle + "\n");

        rectangle = new Rectangle(5, 7);
        System.out.println(rectangle + "\n");

        rectangle = new Rectangle(5, 7, "blue", true, 50);
        System.out.println(rectangle + "\n");
    }


}
