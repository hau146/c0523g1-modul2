package ss12_conllection_framework.bai_tap.product.view;

import ss12_conllection_framework.bai_tap.product.controller.ProductController;

import java.util.Scanner;

public class ViewProduct {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ProductController.showMenu();
    }
}
