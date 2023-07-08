package ss6_ke_thua.bai_tap.point2d_and_point3d;

import java.util.Arrays;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;

    protected Point2D() {
    }

    protected Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    protected void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    protected float[] getXY() {
        float[] getXY = new float[]{getX(), getY()};

        return getXY;
    }

    @Override
    public String toString() {
        return "Lớp Point2D có mảng gồm các nghiệm " + Arrays.toString(getXY()) + " là lớp cha của " + super.toString();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(3, 5);
        System.out.println(point2D);
    }
}
