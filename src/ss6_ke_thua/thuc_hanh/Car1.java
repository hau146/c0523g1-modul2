package ss6_ke_thua.thuc_hanh;

public class Car1 extends Vehicle {
    public String modelName = "MayBach";

    public static void main(String[] args) {
        Car1 myCar = new Car1();
        myCar.run();
        System.out.println(myCar.color + "\n" + myCar.model);
    }
}
