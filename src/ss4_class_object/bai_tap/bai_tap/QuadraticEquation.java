package ss4_class_object.bai_tap.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        double square = this.b * this.b;
        double total = 4 * this.a * this.c;
        return (-this.b + Math.pow(square - total, 1 / 2)) / 2 * this.a;
    }

    public double getRoot2() {
        double square = this.b * this.b;
        double total = 4 * this.a * this.c;
        return (-this.b - Math.pow(square - total, 1 / 2)) / 2 * this.a;
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
