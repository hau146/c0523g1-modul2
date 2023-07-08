package ss6_ke_thua.thuc_hanh;

public class Bicycle extends Vehicle {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle();
        myBike.run();
        System.out.println(myBike.color + "\n" + myBike.model);
    }
}
