package ss6_ke_thua.bai_tap.point_and_movabpoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    protected float xSpeed = 0.0f;
    protected float ySpeed = 0.0f;

    protected MovablePoint() {
    }

    protected MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    protected MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    protected void setSpeed(float xSpeed, float ySpeed) {
        xSpeed = getXSpeed();
        ySpeed = getYSpeed();
    }

    protected float[] getSpeed() {
        float[] getSpeed = new float[]{getX(), getY()};
        return getSpeed;
    }

    @Override
    public String toString() {
        return "lớp MovablePoint có " + Arrays.toString(getSpeed()) + "\ntốc độ " + getXSpeed() + ", " + getYSpeed() + "\nkế thừa từ " + super.toString();
    }

    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }


    public static void main(String[] args) {
        Point point = new MovablePoint();
        System.out.println(point);
        System.out.println();

        point = new MovablePoint(4, 5);
        System.out.println(point);
        System.out.println();

        point = new MovablePoint(7, 8, 9, 10);
        System.out.println(point);
    }
}
