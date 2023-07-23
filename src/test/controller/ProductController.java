package test.controller;

import test.service.IProductService;
import test.service.ProductService;

import java.util.Scanner;

public class ProductController {
    static Scanner scanner = new Scanner(System.in);
    public static void showMenu(){
        IProductService productService = new ProductService();
        int selection = 0;
        do {
            System.out.println("Nhập vào coi");
            System.out.println("Alo");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection){
                case 1:
                    productService.displayProduct();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.deleProduct();
                    break;
            }
        } while (true);
    }
}
