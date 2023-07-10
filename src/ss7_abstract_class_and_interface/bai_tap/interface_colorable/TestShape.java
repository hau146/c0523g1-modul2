package ss7_abstract_class_and_interface.bai_tap.interface_colorable;

import java.util.Arrays;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(4);
        shape[1] = new Rectangle(4, 5);
        shape[2] = new Square(8);


        for (Shape newShape : shape) {
            System.out.println(newShape);
            if (newShape instanceof Square) {
                ((Square) newShape).howtoColor();
            }
            System.out.println("");
        }
        Arrays.toString(shape);
    }
}



