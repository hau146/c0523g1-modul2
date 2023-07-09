package ss6_ke_thua.bai_tap.point_and_movabpoint;

import java.util.Arrays;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;
    protected Point(){}
    protected Point(float x, float y){
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
    protected void setXY(float x, float y){
        x = getX();
        y = getY();
    }
    protected float[] getXY(){
        float[] getXY = new float[]{getX(),getY()};
        return getXY;
    }
    @Override
    public String toString(){
        return "Lớp Point gồm các nghiệm " + Arrays.toString(getXY()) + "\nlà lớp cha của " + super.toString();
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        System.out.println();

        point = new Point(9,10);
        System.out.println(point);
    }
}
