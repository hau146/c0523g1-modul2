package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Square extends Shape implements Resizeable {
    private double edge = 4;

    public Square() {
    }

    public Square(int edge) {
        this.edge = edge;
    }

    public Square(int edge, String color, boolean filled) {
        super(color, filled);
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
                ", which is a subclass of " + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.edge = this.edge * Math.sqrt(percent + 1);
    }
}
