package ss5_accessmodifier_staticmethod.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("MayBack", "Skyactiv 3");
        Car car2 = new Car("Mec", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
        System.out.println(Car.numberOfCars);
    }
}
