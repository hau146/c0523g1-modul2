package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

import java.util.Arrays;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(3.5, "red", true);
        shape[1] = new Rectangle(5, 7, "blue", true);
        shape[2] = new Square(5, "white", false);

        System.out.println("Các hình trước khi tăng kích thước là");
        for (Shape shapes : shape) {
            System.out.println(shapes);
        }
        Arrays.toString(shape);

        System.out.println("\nCác hình sau khi tăng kích thước là");
        //      ((Square)shape[2]).resize(23);
        shape[0].resize(0.7);
        shape[1].resize(0.10);
        shape[2].resize(0.9);
        for (Shape shapes : shape) {
            System.out.println(shapes);
        }
    }

}
