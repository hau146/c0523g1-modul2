package ss6_ke_thua.thuc_hanh.test;

import ss6_ke_thua.thuc_hanh.shape.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle() {
            @Override
            public void setLenght(double lenght) {

            }
        };
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8) {
            @Override
            public void setLenght(double lenght) {

            }
        };
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8, "black", true) {
            @Override
            public void setLenght(double lenght) {

            }
        };
        System.out.println(rectangle);
    }
}
