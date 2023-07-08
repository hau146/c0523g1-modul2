package ss4_class_object.bai_tap.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    private QuadraticEquation() {

    }

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getA() {
        return a;
    }

    private double getB() {
        return b;
    }

    private double getC() {
        return c;
    }

    private double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    private double getRoot1() {
        return (-this.b + Math.pow(this.getDiscriminant(), 1 / 2)) / 2 * this.a;
    }

    private double getRoot2() {
        return (-this.b - Math.pow(this.getDiscriminant(), 1 / 2)) / 2 * this.a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation area = new QuadraticEquation(a, b, c);

        if (area.getDiscriminant() > 0) {
            System.out.println(area.getRoot1());
            System.out.println(area.getRoot2());
        } else if (area.getDiscriminant() == 0) {
            System.out.println("One root");
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
