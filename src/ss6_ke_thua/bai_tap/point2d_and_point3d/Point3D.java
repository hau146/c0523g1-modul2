package ss6_ke_thua.bai_tap.point2d_and_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    protected float z = 0.0f;

    protected Point3D() {
    }

    protected Point3D(float z) {
        this.z = z;
    }

    protected Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    protected void setXYZ(float x, float y, float z) {
        x = getX();
        y = getY();
        z = getZ();
    }

    protected float[] getXYZ() {
        float[] getXYZ = new float[]{getX(), getY(), getZ()};
        return getXYZ;
    }

    @Override
    public String toString() {
        return "Lớp Point3D có mảng gồm các nghệm " + Arrays.toString(getXYZ()) + "\n2 nghiệm " + getX() + ", " + getY() + " kế thừa từ lớp cha " + super.toString();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point3D();
        System.out.println(point2D);
        System.out.println();

        point2D = new Point3D(3);
        System.out.println(point2D);
        System.out.println();

        point2D = new Point3D(3, 4, 5);
        System.out.println(point2D);
    }
}
