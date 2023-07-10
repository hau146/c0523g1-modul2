package ss7_abstract_class_and_interface.bai_tap.interface_colorable;

public class Square extends Shape implements Colorable{
    private double edge = 4;

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, double edge) {
        super(color);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides..");
    }
}
