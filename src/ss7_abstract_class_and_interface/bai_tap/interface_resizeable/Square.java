package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Square extends Shape implements Resizeable {
    private double edge = 4;

    public Square() {
    }

    public Square(int edge) {
        this.edge = edge;
    }

    public Square(int edge, String color, boolean filled, double size) {
        super(color, filled, size);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    public double getPerimeter() {
        return 4 * getEdge();
    }

    public double getAcreage() {
        return getEdge() * getEdge();
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", size=" + size +
                ", which is a subclass of " + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.size = this.edge * percent;
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square + "\n");

        square = new Square(7);
        System.out.println(square + "\n");

        square = new Square(5, "white", false, 15);
        System.out.println(square);
    }


}
