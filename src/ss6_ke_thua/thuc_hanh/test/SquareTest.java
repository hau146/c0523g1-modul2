package ss6_ke_thua.thuc_hanh.test;

import ss6_ke_thua.thuc_hanh.shape.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(2.3, "blue", false);
        System.out.println(square);
    }
}
